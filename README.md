# Thema 09 Machine learning
Dennis Haandrikman, 347655,
HanzeHogeschool Groningen


### Introduction

This experiment is a means to explore machine learning practices,
while trying to contribute to the current day relevant topic of vaccine prediction for diseases akin to COVID-19.
If successful, this practice could be used to help vaccine creation based on peptide/protein sequences henceforth.

As such, the experiment will recreate the experiment/project that was done with this dataset.
Which is to calculate how many antigen binding sites are on COVID-19 peptide/protein sequences, based on the peptide/protein characteristics.

As such the following research question has been formulated:

Is it possible to predict if an amino-acid peptide promotes antibody-inducing activities, based on the peptide/protein structure and properties?
And is it possible to try to expand or improve on the experiment and predictions that have been done previously on the same dataset regarding COVID-19?

The paper for this experiment can be read on the following link: https://www.biorxiv.org/content/10.1101/2020.07.27.224121v1


### Data

The experiment makes use of a dataset used for epitome prediction for COVID-19 peptide sequences,
available on the following website:
https://www.kaggle.com/datasets/futurecorporation/epitope-prediction

It consists of 3 different csv files, which can be found in the /Data folder, they are the following:
1. input_bcell.csv; The main training data, consisting 14387 rows for all combinations of 14362 peptides and 757 proteins.
2. input_sars.csv; Additional main training data, consisting of 520 rows.
3. input_covid.csv; The target data, there is no label data in the columns.

In all three the datasets there is information of the protein and peptide:
1. parent_protein_id; parent protein ID
2. protein_seq; parent protein sequence
3. start_position; start position of peptide
4. end_position; end position of peptide
5. peptide_seq; peptide sequence 
6. chou_fasman; peptide feature, ß turn
7. emini; peptide feature, relative surface accessibility
8. kolaskar_tongaonkar; peptide feature, antigenicity
9. parker; peptide feature, hydrophobicity
10. isoelectric_point; protein feature
11. aromacity; protein feature
12. hydrophobicity; protein feature
13. stability; protein feature 

Further information about the variables is located in the peptide_protein_properties_codebook.csv file.

### Usage

The usage for the EDA and the Java_wrapper are located in both sub-folders.

### Tree of the project
```
│   .gitattributes
│   .gitignore
│   README.md
│
├───EDA_analysis
│   │   peptide_protein_properties_codebook.csv
│   │   README.md
│   │
│   ├───Data
│   │   │   input_bcell.csv
│   │   │   input_covid.csv
│   │   │   input_sars.csv
│   │   │
│   │   ├───Images
│   │   │       Figure1.png
│   │   │       Figure2.png
│   │   │       Figure3.png
│   │   │       Figure4_heatmap.png
│   │   │       Figure5.png
│   │   │       Figure6.png
│   │   │       Figure7.png
│   │   │
│   │   └───Weka
│   │       │   bcel_sars_data.arff
│   │       │   bcel_sars_log_transform.arff
│   │       │   Cost_sensitive_test_machine_learning.arff
│   │       │   exploratory_weka_algorythm_analysis.arff
│   │       │   exploratory_weka_algorythm_analysis.exp
│   │       │
│   │       ├───Models
│   │       │       RandomForest_500_iterations.model
│   │       │       RandomForest_500_iterations_randomtiebreaks.model
│   │       │
│   │       └───ROC_curve
│   │               Non-promoting_ROC-curve.arff
│   │               Promoting_ROC-curve.arff
│   │
│   ├───EDA_files
│   │       Thema-09_EDA_log.pdf
│   │       Thema-09_EDA_log.rmd
│   │
│   └───EDA_report
│           EDA_report_Dennis_Haandrikman.pdf
│           EDA_report_Dennis_Haandrikman.rmd
│
└───Java_wrapper
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
