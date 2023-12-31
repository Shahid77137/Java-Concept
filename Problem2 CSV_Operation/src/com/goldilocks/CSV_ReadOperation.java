package com.goldilocks;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// public class CSV_ReadOperation {
	
// 	public static void main(String[] args) {
// 		String inputFile = "input.csv";
//         String outputFile = "output.csv";
//         try {
//             BufferedReader reader = new BufferedReader(new FileReader(inputFile));
//             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
//             String line;
//             double sum = 0.0;
//             while ((line = reader.readLine()) != null) {
//                 String[] values = line.split(",");
//                 if (values.length >= 3) {
//                     double num1 = Double.parseDouble(values[0]);
//                     double num2 = Double.parseDouble(values[1]);
//                     double num3 = Double.parseDouble(values[2]);
//                     sum += num1 + num2 + num3;

//                     writer.write(line + "," + (num1 + num2 + num3));
//                     writer.newLine();
//                 }
//             }

//             reader.close();
//             writer.close();

//             System.out.println("Output written to the " + outputFile +" Successfully");
//             System.out.println("Go and check "+ outputFile + "file");
//         } catch (IOException e) {
//             System.out.println(e.getMessage());
//         }
// 	}
// }


public class CSV_ReadOperation {
	public static void main(String[] args) {
		String inputFile = "input.csv";
		String outputFile = "output.csv";
		try {
			BufferedReader reader = new BufferedReader(new FileReader(inputFile));
			BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
			String header = reader.readLine();
			String line;
			while ((line = reader.readLine()) != null) {
				String[] val = line.split(",");
				int sum = 0;
				for (int i = 0; i < val.length; i++) {
					
					int num = Integer.parseInt(val[i].trim());
					sum += num;
				}
				
                if(null != header && !header.isEmpty()) {
    				writer.write(header + "," + "Sum");
    				writer.newLine();
    				header = "";
                }
				writer.write(line + "," + sum);
				writer.newLine();
			}
			reader.close();
			writer.close();
			System.out.println("Output written to the " + outputFile + " file Successfully!!!");
			System.out.println();
			System.out.println("Go and check " + outputFile + "file");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}


