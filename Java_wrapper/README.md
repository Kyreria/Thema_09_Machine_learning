#Java wrapper
Dennis Haandrikman,
HanzeHogeschool Groningen

This sub-folder of the repo is for the Java wrapper.
This entails the following:
1. It contains the src folder for the java project
2. It contains the algorithm model in the src/resources
3. It contains test-data for use with the "Usable build" jar file.

The Java project was made using gradle and as such needs to be build using gradle as well.
The Java wrapper is to run the WEKA machine algorithm model with use of the command console.

## Usage

If you wish to build the java file yourself, you can do so by loading this folder as an IntelliJ project and building the project with build.gradle.
You can also use the .jar file in the folder /Usable_build with the following command while in the folder:
``java -jar MLModelWrapper_with_dep-1.0-all.jar [insert data here]``
The test run would be the following:
```java -jar MLModelWrapper_with_dep-1.0-all.jar ../test_data/bcel_sars_log_transform_test_data.arff```

## Tree of the Java_Wrapper

```
│   README.md
│
└───ML_Java_Wrapper
    │   build.gradle
    │   settings.gradle
    │
    ├───src
    │   └───main
    │       ├───java
    │       │   └───nl
    │       │       └───bioinf
    │       │           └───dhaandrikman
    │       │               └───Java_wrapper
    │       │                       WekaRunner.java
    │       │
    │       └───resources
    │               RandomForest_500_iterations.model
    │
    ├───test_data
    │       bcel_sars_log_transform_test_data.arff
    │
    └───Usable_Build
            MLModelWrapper_with_dep-1.0-all.jar
```