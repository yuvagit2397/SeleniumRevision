package seleniumInterViewPreparation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import au.com.bytecode.opencsv.CSVReader;

public class CSV_FileReading {
public static void main(String[] args) throws IOException {
		
	
	File f=new File("C:\\Users\\SENTHIL\\Desktop\\csvReading.csv");
	FileReader fr=new FileReader(f);
	//BufferedReader br=new BufferedReader(fr);
	CSVReader cr=new CSVReader(fr);
	String[] read;
	while ((read=cr.readNext())!=null) {
		System.out.println("1 = "+read[0]);
		System.out.println("2 = "+read[1]);
}
}}
