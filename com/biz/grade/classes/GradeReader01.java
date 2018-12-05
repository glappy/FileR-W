package com.biz.grade.classes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.grade.vo.StudentVO;

public class GradeReader01 {

	private List<StudentVO> stList;
	private String readFile;

	public GradeReader01() {
		stList = new ArrayList();
		this.readFile = "src/com/biz/grade/우리말이름.txt";
	}

	public GradeReader01(String readFile) {
		stList = new ArrayList();
		this.readFile = readFile;
	}

	public List<StudentVO> getStList() {
		return stList;
	}

	public void studentInfoRead() {
		FileReader fr;
		BufferedReader buffer;

		try {
			fr = new FileReader(this.readFile);
			
			int intNum = 0 ;
			while (true) {
				buffer = new BufferedReader(fr);
				String reader = buffer.readLine();

				if (reader == null)
					break;
				String[] names = reader.split(":");
				StudentVO vo = new StudentVO();
				vo.setStrNum("" + ++intNum);
				vo.setStrKorName(names[0]);
				stList.add(vo);
			}
			buffer.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
