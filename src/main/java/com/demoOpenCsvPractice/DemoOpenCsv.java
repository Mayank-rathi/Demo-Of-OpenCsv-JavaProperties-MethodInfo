package com.demoOpenCsvPractice;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DemoOpenCsv {
    private static final String SAMPLE_CSV_FILE_PATH = "src/userCsvFiles/users.csv";

    public static void main(String[] args) throws IOException {
        try (Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
             //To Skip Specific record we can creat such object
             final CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();
             //Normal object creation
             //CSVReader csvReader = new CSVReader(reader);
        ) {
            String[] nextRecord;
            //Extrac data one by one using array
            while ((nextRecord = csvReader.readNext()) != null) {
                System.out.println("NAME : " + nextRecord[0]);
                System.out.println("Email : " + nextRecord[1]);
                System.out.println("Phone : " + nextRecord[2]);
                System.out.println("Country : " + nextRecord[3]);
                System.out.println("---------------------------");
            }
        }
    }

}
