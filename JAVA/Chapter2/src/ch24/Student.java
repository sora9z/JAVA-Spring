package ch24;

import  java.util.ArrayList;

// stdnId stdname, subject array list, addSubmect, showStudentInfo 
public class Student {
	
	int studentID;
	String studentName;
	ArrayList<Subject> subjecList;
	
	public Student(int stduntID,String studentName){
		
		this.studentID=studentID;
		this.studentName=studentName;
		subjecList=new ArrayList<Subject>();
		
		
	}
	
	public void addSubject(String name,int score) {
		Subject subject=new Subject();
		
		subject.setName(name);
		subject.setScore(score);
		subjecList.add(subject);		
		
	}
	
	public void showStudentInfo() {
		int total=0;
		
		for(Subject s:subjecList) {
			total+=s.getScore();
			System.out.println(studentName+"'s"+s.getName()+"scoer is"+s.getScore());
			
		}
		
		System.out.println(studentName+" 's total score is"+total);
		
	}
	
	
	
	

}
