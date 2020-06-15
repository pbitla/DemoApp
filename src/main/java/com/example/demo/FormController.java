package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {
	
	Map<String, Questions> question = new HashMap<>();
	
	public Map<String, Questions> getQuestion() {
		return question;
	}

	public void setQuestion(Map<String, Questions> question) {
		this.question = question;
	}
	

	@GetMapping("/")
	public String addElement( Model model) {
		model.addAttribute("questions", question);
		model.addAttribute("foo", new Foo());
		return "index.html"; // view
	}
	@PostMapping("addQuestion")
	public String addElement(@ModelAttribute(value = "foo") Foo foo, Model model) {

		System.out.println("------" + foo.getFillInTheBlankInfo());
		System.out.println("------" + foo.getQuestionType());

		switch (foo.getQuestionType()) {

		case "":
			break;
		case "1":
			String questionInfo = foo.getFillInTheBlankInfo();
			String[] questionArray = questionInfo.split(" ");
			System.out.println("INSIDE 1" + questionArray.length);
			List<String> questions = new ArrayList<>();
			String quesInfo = "";
			for (int i = 0; i < questionArray.length; i++) {
				if (questionArray[i].equals("[]")) {
					questions.add(quesInfo);
					questions.add("[]");
					quesInfo = "";
				} else {
					quesInfo += questionArray[i] + " ";
				}

			}
			questions.add(quesInfo);
			questions.stream().forEach(System.out::println);
			Questions question = new Questions();
			question.getfItB().addAll(questions);
			question.setQuestionType(foo.getQuestionType());

			String index = getNextIndex(this.getQuestion());
			System.out.println("INSIDE 1---->>" + index);
			this.getQuestion().put(index, question);
			break;
		case "2":
			Questions question1 = new Questions();
			question1.setMulitpleChoiceQInfo(foo.getMulitpleChoiceQInfo());
			question1.setOption1(foo.getOption1());
			question1.setOption2(foo.getOption2());
			question1.setOption3(foo.getOption3());
			question1.setOption4(foo.getOption4());
			question1.setQuestionType(foo.getQuestionType());
			
			String index1 = getNextIndex(this.getQuestion());
			System.out.println("INSIDE 2---->>" + index1);
			this.getQuestion().put(index1, question1);
			
			System.out.println(""+ foo.getMulitpleChoiceQInfo());
			System.out.println(""+ foo.getOption1());
			System.out.println(""+foo.getOption2());
			System.out.println(""+foo.getOption3());
			System.out.println(""+foo.getOption4());
			
			break;
		case "3":
			
			String questionInfo2 = foo.getFillInTheBlankInfoDrg();
			String[] questionArray2 = questionInfo2.split(" ");
			System.out.println("INSIDE 3" + questionArray2.length);
			List<String> questions2 = new ArrayList<>();
			String quesInfo2 = "";
			for (int i = 0; i < questionArray2.length; i++) {
				if (questionArray2[i].equals("[]")) {
					questions2.add(quesInfo2);
					questions2.add("[]");
					quesInfo2 = "";
				} else {
					quesInfo2 += questionArray2[i] + " ";
				}

			}
			questions2.add(quesInfo2);
			questions2.stream().forEach(System.out::println);
			
			Questions question2 = new Questions();
			question2.getfItB().addAll(questions2);
			
			question2.setQuestionType(foo.getQuestionType());

			String questionOptions2 = foo.getFillInTheBlankInfoDrgOptions();
			String[] questionOptions2Arr = questionOptions2.split(",");
			List<String> dragOptions = Arrays.asList(questionOptions2Arr);
			
			dragOptions.stream().forEach(System.out::println);
			question2.getDragOptions().addAll(dragOptions);
			
			String index2 = getNextIndex(this.getQuestion());
			System.out.println("INSIDE 3---->>" + index2);
			this.getQuestion().put(index2, question2);
			
			break;
		case "4":
			break;

		}
		model.addAttribute("questions", question);
		model.addAttribute("foo", new Foo());
		return "index.html"; // view
	}

	public String getNextIndex(Map<String, Questions> map) {
		return map.size() == 0 ? String.valueOf(1) : String.valueOf(map.size() + 1);
	}
}
