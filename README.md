# Thema 09 Machine learning
Dennis Haandrikman,
HanzeHogeschool Groningen


### Introduction

This experiment is a means to explore machine learning practices,
while trying to contribute to the current day relevant topic of vaccine prediction for diseases akin to COVID-19.
If successful, this practice could be used to help vaccine creation based on peptide/protein sequences henceforth.

As such, the experiment will recreate the experiment/project that was done with this dataset.
Which is to calculate how many antigen binding sites are on COVID-19 peptide/protein sequences, based on the peptide/protein characteristics.

As such the following research question has been formulated:

Is it possible to predict if an amino-acid peptide promotes antibody-inducing activites, based on the peptide/protein structure and properties?
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

First, make sure that the data contains the information given above and is in the /Data folder.

Then run the Thema-09_log.rmd to produce the pdf file.

### 