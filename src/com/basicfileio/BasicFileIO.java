package com.basicfileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BasicFileIO {
	public static void main(String[] args) {
		File f = new File("file.txt");
		// file substitute to print out and print in
		try {
			PrintWriter output = new PrintWriter(f);
			output.println("Rishabh Jha");
			output.println(6);
			output.close();
		} catch (IOException ex) {
			System.out.printf("ERROR: %s /n", ex);
		}
        Scanner input;
		try {
			input = new Scanner(f);
		
		
        String name = input.nextLine();
        int age =input.nextInt();
        System.out.printf("Name: %s Age %d/n ",name,age );
		}
		 catch (FileNotFoundException ex) {
			 System.out.printf("ERROR: %s /n", ex);
		 }
        
	}
}
