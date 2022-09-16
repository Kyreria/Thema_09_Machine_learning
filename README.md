# Thema 09 Machine learning
Dennis Haandrikman,
HanzeHogeschool Groningen


### Introduction

This experiment is a means to explore machine learning practices,
while trying to contribute to the current day relevant topic of vaccine prediction for diseases akin to COVID-19.

It does so by trying to find correlations in peptide sequence characteristics and which characteristics are deterministic for a high valance calculation.


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


### Usage


### 