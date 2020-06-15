package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Questions {

	public String questionType;

	//1 & 3
	List<String> fItB = new ArrayList<>();
	//3 -options
	List<String> dragOptions = new ArrayList<>();

	//2
	public String mulitpleChoiceQInfo;

	public String option1;
	public String option2;
	public String option3;
	public String option4;

	public List<String> getfItB() {
		return fItB;
	}

	public void setfItB(List<String> fItB) {
		this.fItB = fItB;
	}

	public String getQuestionType() {
		return questionType;
	}

	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}

	public String getMulitpleChoiceQInfo() {
		return mulitpleChoiceQInfo;
	}

	public void setMulitpleChoiceQInfo(String mulitpleChoiceQInfo) {
		this.mulitpleChoiceQInfo = mulitpleChoiceQInfo;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public List<String> getDragOptions() {
		return dragOptions;
	}

	public void setDragOptions(List<String> dragOptions) {
		this.dragOptions = dragOptions;
	}
	
	

}
