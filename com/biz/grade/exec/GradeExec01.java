package com.biz.grade.exec;

import java.util.List;

import com.biz.grade.classes.GradeReader01;
import com.biz.grade.vo.StudentVO;

public class GradeExec01 {

	public static void main(String[] args) {
		
	
		String strFile = "src/com/biz/grade/우리말이름.txt";
		GradeReader01 gr = new GradeReader01(strFile);
		
		//파일 읽어서 리스트에 저장하는 부분을 실행해보자
		gr.studentInfoRead();
		
		List<StudentVO> stList = gr.getStList()	;
		
		for(StudentVO v : stList) {
			System.out.println(v);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}


































