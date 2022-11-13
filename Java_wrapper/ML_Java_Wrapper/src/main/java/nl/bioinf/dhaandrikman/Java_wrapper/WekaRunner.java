package nl.bioinf.dhaandrikman.Java_wrapper;


import weka.core.Instances;
import weka.classifiers.Classifier;
import weka.core.converters.ConverterUtils.DataSource;
import weka.core.SerializationHelper;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;


/**
 * Main class for the Java wrapper around the machine learning model.
 * This is designed to work with user input, provided through the command line in a terminal.
 * The class is final, as it wasn't meant to be extended.
 *
 * @ Authoer Dennis Haandrikman (347655)
 */
public class WekaRunner {
    /**
     * Initialize the model
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        WekaRunner runner = new WekaRunner();
        runner.start(args);
    }

    private void start(String[] args) {
        //String datafile = args[0];
        String testfile = args[0];
        System.out.println("Loading Data file: " + testfile);
        try {
            Classifier rf = loadClassifier();
            Instances unknownInstances = loadArff(testfile);
            System.out.println("\nunclassified unknownInstances = \n" + unknownInstances);
            classifyNewInstance(rf, unknownInstances);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void classifyNewInstance(Classifier myClassifier, Instances unknownInstances) throws Exception {
        // create copy
        Instances labeled = new Instances(unknownInstances);
        // label instances and prints them to the terminal
        for (int i = 0; i < unknownInstances.numInstances(); i++) {
            double clsLabel = myClassifier.classifyInstance(unknownInstances.instance(i));
            labeled.instance(i).setClassValue(clsLabel);
        }
        // Print the information to the label
        System.out.println("\nNew, labeled = \n" + labeled);
    }

    private Classifier loadClassifier() throws Exception {
        //get own model
        String modelFile = "/RandomForest_500_iterations.model";
        try {
            InputStream in = getClass().getResourceAsStream(modelFile);
            return (Classifier) SerializationHelper.read(in);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private Instances loadArff(String testfile) throws IOException {
        /**
         * Load the arff data file that the user designated.
         */
        try {
            DataSource source = new DataSource(testfile);
            Instances data = source.getDataSet();
            // setting class attribute if the data format does not provide this information
            // For example, the XRFF format saves the class attribute information as well
            if (data.classIndex() == -1)
                data.setClassIndex(data.numAttributes() - 1);
            return data;
        } catch (Exception e) {
            throw new IOException("could not read from file");
        }
    }
}