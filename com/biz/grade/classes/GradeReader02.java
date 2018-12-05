package com.biz.grade.classes;

import java.util.ArrayList;
import java.util.List;

import com.biz.grade.vo.StudentVO;

public class GradeReader02 {

	private String nameFile = "src/com/biz/grade/우리말이름.txt";
	List<StudentVO> stList;

	public GradeReader02() {

	}

	public GradeReader02(String nameFile) {
		this.nameFile = nameFile;
		this.stList = new ArrayList();
	}

	public void makeNames() {

		StudentVO vo = new StudentVO();
		vo.setStrKorName("홍길동");
		stList.add(vo);

	}

}