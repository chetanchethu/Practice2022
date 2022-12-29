package com.practi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Filess {

	public static void main(String[] args) throws Exception {
		String keyWord="test";
		BufferedReader reader=new BufferedReader(new FileReader("E://test.txt"));
		
		
		String fileouts;
		int count=0;
		while((fileouts=reader.readLine()) != null) {
			 //fileouts=reader.readLine();
//			String q=reader.readLine()+"\n";
//			fileouts+=q;
//			 System.out.println(fileouts);
			count++;
		}
		//System.out.println(fileouts);
			if(fileouts.matches(keyWord)) {
				BufferedWriter writer=new BufferedWriter(new FileWriter("E://newfile.txt"));
				writer.write(fileouts+"newly added line");
				System.out.println("success2");
				writer.flush();
				writer.close();
				System.out.println("success");
			}reader.close();
		
	}
	}

//}
