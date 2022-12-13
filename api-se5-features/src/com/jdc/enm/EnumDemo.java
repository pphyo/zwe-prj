package com.jdc.enm;

public class EnumDemo {
	
	public enum Day {
		MON, TUE, WED, THU, FRI, SAT, SUN
	}
	//Type Safe
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Day day = Day.MON; // new Day("Mon", 0);
		
		Day[] values = Day.values();
		
		Day str = Day.valueOf("THU");
		
		System.out.println(Day.MON == Day.MON);
		
		Courses[] arr = Courses.values();

		for(Courses c : arr) {
			System.out.println(c.getName() + ": " + c.getFee());
		}
		
	}

}
