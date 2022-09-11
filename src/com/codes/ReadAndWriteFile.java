package com.codes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * read and write to existing file
 */
public class ReadAndWriteFile {

	static void read() throws Exception {
		try (BufferedReader fo = new BufferedReader(new FileReader("c://D/ctsads.txt"));) {
			String st;
			while ((st = fo.readLine()) != null) {
				// if(st.contains("3rd")) {
				System.out.println(st);
				// }
			}

		} catch (Exception e) {
			throw new FileNotFoundException("File with the specified name not present");
		}
	}

	static void write() throws IOException {// using try with resource block of JE7
		try (FileWriter f = new FileWriter("c://D/ctsads.txt",true);
				BufferedWriter b = new BufferedWriter(f);		
				PrintWriter p = new PrintWriter(b);) {
			p.write("hi thissss");
			// p.println("f"); //println or write or append

		} catch (IOException i) {
			i.printStackTrace();
		}

	}

	public static void main(String[] args) throws Exception {
		ReadAndWriteFile rw = new ReadAndWriteFile();
		//rw.read();
		 rw.write();
	}
}