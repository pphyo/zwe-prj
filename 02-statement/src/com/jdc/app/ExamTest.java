package com.jdc.app;

public class ExamTest {

	public static void main(String[] args) {
		checkExam(75, 75, 80);
	}
	
	static void checkExam(int mmMark, int engMark, int mathsMark) {
		
		if(mmMark < 40 || engMark < 40 || mathsMark < 40) {
			System.out.println("Sorry! You fail.");				
		} else if(mmMark < 75 && engMark < 75 && mathsMark < 80) {
			System.out.println("Congrats! You pass.");
		} else {
			
			int destination = 0;
			
			if(mmMark >= 75)
				destination++;
			
			if(engMark >= 75)
				destination++;
			
			if(mathsMark >= 80)
				destination++;
				
			System.out.println("Great! You passed the exam with " + destination + "D.");
			
		}
		
	}

}
