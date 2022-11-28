package com.demo.beans;

import java.util.Arrays;

public class Exam {

	//instance variables examid,ename,and array of questions is taken in constructor
	private int examid;
	private String ename;
	private String Q;
	public Question[]ques;

	//default constructor Exam
	public Exam() {
		this.examid=0;
		this.ename=null;
		//this.Q=null;
		this.ques=null;
	}

	//parameterized constructor 
	public Exam(int exid,String ename,Question[]ques) {
		this.examid=exid;
		this.ename=ename;
		//this.Q=Q;
		this.ques=ques;
	}

	//getters and setters
	public int getExamid() {
		return examid;
	}

	public void setExamid(int examid) {
		this.examid = examid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Question[] getQues() {
		return ques;
	}

	public void setQues(Question[] ques) {
		this.ques = ques;
	}

	//to String
	@Override
	public String toString() {
		String str= "Exam [examid=" + examid + ", ename=" + ename + ", ques=" + Arrays.toString(ques) + "]";
		for(int i=0;i<ques.length;i++) {
			str=" "+ques[i]+"\n";
			System.out.println(ques[i]);
		}
		return str;
	}

}
