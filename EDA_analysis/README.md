#EDA exploration
Dennis Haandrikman,
HanzeHogeschool Groningen

This sub-folder of the repo is for the data-exploratory part.
This entails the following:
1. EDA exploration of the data & clean-up for machine learning.
2. Exploring machine learning algorithms with WEKA
3. Choosing & generating the best model with WEKA

This part of the repo as thus consists of the Rmarkdown files and mainly R & Weka files.

## EDA usage
First, make sure that the data contains the information given above and is in the /Data folder.

Make sure to have the required packages installed for R, they are as follows; pander, ggplot2, dplyr, ggpubr, devtools, ggbiplot & RWeka.
If they are not installed make sure to run the code that is below this:

```r
install.packages("pander")
install.packages("ggplot2")
install.packages("dplyr")
install.packages("ggpubr")
install.packages("devtools")
library("devtools")
install_github("vqv/ggbiplot")
install.packages("RWeka")
library("data.table")
```

Make sure to set the working directory to the EDA_files folder with ``setwd("EDA_files")``
Then run the Thema-09_log.rmd to produce the pdf file for the EDA explanation.

If you wish to create the Report of the complete project:
Set the working directory to the EDA_report folder with ``setwd("EDA_report")``
Then run the EDA_report_Dennis_Haandrikman.rmd to produce the pdf file for the full report of the project.

## Tree of the EDA folder

```
│   peptide_protein_properties_codebook.csv
│   README.md
│
├───Data
│   │   input_bcell.csv
│   │   input_covid.csv
│   │   input_sars.csv
│   │
│   ├───Images
│   │       Figure1.png
│   │       Figure2.png
│   │       Figure3.png
│   │       Figure4_heatmap.png
│   │       Figure5.png
│   │       Figure6.png
│   │       Figure7.png
│   │
│   └───Weka
│       │   bcel_sars_data.arff
│       │   bcel_sars_log_transform.arff
│       │   Cost_sensitive_test_machine_learning.arff
│       │   exploratory_weka_algorythm_analysis.arff
│       │   exploratory_weka_algorythm_analysis.exp
│       │
│       ├───Models
│       │       RandomForest_500_iterations.model
│       │       RandomForest_500_iterations_randomtiebreaks.model
│       │
│       └───ROC_curve
│               Non-promoting_ROC-curve.arff
│               Promoting_ROC-curve.arff
│
├───EDA_files
│       Thema-09_EDA_log.pdf
│       Thema-09_EDA_log.rmd
│
└───EDA_report
        EDA_report_Dennis_Haandrikman.pdf
        EDA_report_Dennis_Haandrikman.rmd
```