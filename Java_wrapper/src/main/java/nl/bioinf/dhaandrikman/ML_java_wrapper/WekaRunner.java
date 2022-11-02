package nl.bioinf.dhaandrikman.ML_java_wrapper;

import weka.classifiers.meta.AttributeSelectedClassifier;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Attribute;
import weka.core.FastVector;
import weka.classifiers.Classifier;
import weka.core.converters.ConverterUtils.DataSource;

import java.io.IOException;
import java.util.Random;

/**
 * If you saved a model to a file in WEKA, you can use it reading the generated java object.
 * Here is an example with Random Forest classifier (previously saved to a file in WEKA):
 * import java.io.ObjectInputStream;
 * import weka.core.Instance;
 * import weka.core.Instances;
 * import weka.core.Attribute;
 * import weka.core.FastVector;
 * import weka.classifiers.trees.RandomForest;
 * RandomForest rf = (RandomForest) (new ObjectInputStream(PATH_TO_MODEL_FILE)).readObject();
 * <p>
 * or
 * RandomTree treeClassifier = (RandomTree) SerializationHelper.read(new FileInputStream("model.weka")));
 */
public class WekaRunner {
    private final String modelFile = "scr/main/resources/RandomForest_500_iterations.model";

    public static void main(String[] args) {
        WekaRunner runner = new WekaRunner();
        runner.start(args);
    }

    private void start(String[] args) {
        //String datafile = args[0];
        String testfile = args[0];
        try {
            RandomForest rf = loadClassifier();
            Instances unknownInstances = loadArff(unknownFile);
            System.out.println("\nunclassified unknownInstances = \n" + unknownInstances);
            classifyNewInstance(rf, unknownInstances);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void classifyNewInstance(RandomForest tree, Instances unknownInstances) throws Exception {
        // create copy
        Instances labeled = new Instances(unknownInstances);
        // label instances
        for (int i = 0; i < unknownInstances.numInstances(); i++) {
            double clsLabel = tree.classifyInstance(unknownInstances.instance(i));
            labeled.instance(i).setClassValue(clsLabel);
        }
        System.out.println("\nNew, labeled = \n" + labeled);
    }

    private AttributeSelectedClassifier loadClassifier() throws Exception {
        //get own model
        return (AttributeSelectedClassifier) weka.core.SerializationHelper.read(modelFile);
    }
    private void printInstances(Instances instances) {
        int numAttributes = instances.numAttributes();

        for (int i = 0; i < numAttributes; i++) {
            System.out.println("attribute " + i + " = " + instances.attribute(i));
        }

        System.out.println("class index = " + instances.classIndex());
//        Enumeration<Instance> instanceEnumeration = instances.enumerateInstances();
//        while (instanceEnumeration.hasMoreElements()) {
//            Instance instance = instanceEnumeration.nextElement();
//            System.out.println("instance " + instance. + " = " + instance);
//        }

        //or
        int numInstances = instances.numInstances();
        for (int i = 0; i < numInstances; i++) {
            if (i == 5) break;
            Instance instance = instances.instance(i);
            System.out.println("instance = " + instance);
        }
    }

    private Instances loadArff(String datafile) throws IOException {
        try {
            DataSource source = new DataSource(datafile);
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