package com.biz.grade;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ConvertName {

	public static void main(String[] args) {

		String readFile = "src/com/biz/grade/우리말.txt";
		String saveFile = "src/com/biz/grade/우리말이름.txt";

		FileReader fr;
		BufferedReader buffer;

		FileWriter fw;
		PrintWriter pw;

		try {
			fr = new FileReader(readFile);
			buffer = new BufferedReader(fr);
			fw = new FileWriter(saveFile);
			pw = new PrintWriter(fw);

			while (true) {
				String reader = buffer.readLine();
				if (reader == null)
					break;

				String[] word = reader.split(" : ");
				String writer = word[0].trim() + ":" + word[1].trim();
				pw.println(writer);
			}
			pw.close();
			fw.close();
			buffer.close();
			fr.close();
			System.out.println("끝났습니다.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
