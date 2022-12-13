package com.jdc.app.util;

import java.util.ArrayList;
import java.util.List;

import com.jdc.app.entity.Student;

public class OutputFormatUtil {
	
//	private static List<List<String>> list = new ArrayList<>();
	private static final String[] header = {"ID", "Name", "Gender", "Age", "Grade", "Phone"};
	private static List<String> idCol = new ArrayList<>();
	private static List<String> nameCol = new ArrayList<>();
	private static List<String> genderCol = new ArrayList<>();
	private static List<String> ageCol = new ArrayList<>();
	private static List<String> gradeCol = new ArrayList<>();
	private static List<String> phoneCol = new ArrayList<>();
	
	static {
		idCol.add(header[0]);
		nameCol.add(header[1]);
		genderCol.add(header[2]);
		ageCol.add(header[3]);
		gradeCol.add(header[4]);
		phoneCol.add(header[5]);
	}
	
	private static int getMaxLength(List<String> list) {
		
		int max = 0;
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).length() > max)
				max = list.get(i).length();
		}
		
		return max;
	}
	
	private static String getTableFormat(int length, boolean isLast) {
		
		String line = getDash(length);
		
		if(!isLast)
			return "+-".concat(line).concat("-");
		
		return "+-".concat(line).concat("-+");
	}

	private static String getDash(int length) {
		String line = "";
		
		for(int i = 0; i < length; i++)
			line += "-";
		return line;
	}
	
	private static String getTableText(int maxLegth, boolean isLast, String text) {
		
		if(text.length() < maxLegth) {
			
			int replaceSpace = maxLegth - text.length();
			
			String space = "";
			
			for(int i = 0; i < replaceSpace; i++)
				space += " ";
			
			text = text.concat(space);
		}
		
		if(!isLast)
			return "| ".concat(text).concat(" ");
		
		return "| ".concat(text).concat(" |");
	}
	
	public static void printTable(List<Student> list) {
		// add student list to column List
		for(Student s : list) {
			idCol.add(String.valueOf(s.getId()));
			nameCol.add(s.getName());
			genderCol.add(s.getGender().toString());
			ageCol.add(String.valueOf(s.getAge()));
			gradeCol.add(s.getGrade().toString());
			phoneCol.add(s.getPhone());
		}
		
		
		
		// show student table with format
		
		// print header
		int idColMaxLength = getMaxLength(idCol);
		int nameColMaxLength = getMaxLength(nameCol);
		int genderColMaxLength = getMaxLength(genderCol);
		int ageColMaxLength = getMaxLength(ageCol);
		int gradeColMaxLength = getMaxLength(gradeCol);
		int phoneColMaxLength = getMaxLength(phoneCol);
		
		System.out.println(getTableFormat(idColMaxLength, false)
			       .concat(getTableFormat(nameColMaxLength, false))
			       .concat(getTableFormat(genderColMaxLength, false))
			       .concat(getTableFormat(ageColMaxLength, false))
			       .concat(getTableFormat(gradeColMaxLength, false))
			       .concat(getTableFormat(phoneColMaxLength, true))
			);
		
		System.out.println(getTableText(idColMaxLength, false, idCol.get(0))
				   .concat(getTableText(nameColMaxLength, false, nameCol.get(0)))
				   .concat(getTableText(genderColMaxLength, false, genderCol.get(0)))
				   .concat(getTableText(ageColMaxLength, false, ageCol.get(0)))
				   .concat(getTableText(gradeColMaxLength, false, gradeCol.get(0)))
				   .concat(getTableText(phoneColMaxLength, true, phoneCol.get(0)))
				);

		System.out.println(getTableFormat(idColMaxLength, false)
			       .concat(getTableFormat(nameColMaxLength, false))
			       .concat(getTableFormat(genderColMaxLength, false))
			       .concat(getTableFormat(ageColMaxLength, false))
			       .concat(getTableFormat(gradeColMaxLength, false))
			       .concat(getTableFormat(phoneColMaxLength, true))
			);

		for(Student s : list) {
			System.out.println(getTableText(idColMaxLength, false, String.valueOf(s.getId()))
					   .concat(getTableText(nameColMaxLength, false, s.getName()))
					   .concat(getTableText(genderColMaxLength, false, s.getGender().toString()))
					   .concat(getTableText(ageColMaxLength, false, String.valueOf(s.getAge())))
					   .concat(getTableText(gradeColMaxLength, false, s.getGrade().toString()))
					   .concat(getTableText(phoneColMaxLength, true, s.getPhone()))
					);
		}
		
		System.out.println(getTableFormat(idColMaxLength, false)
			       .concat(getTableFormat(nameColMaxLength, false))
			       .concat(getTableFormat(genderColMaxLength, false))
			       .concat(getTableFormat(ageColMaxLength, false))
			       .concat(getTableFormat(gradeColMaxLength, false))
			       .concat(getTableFormat(phoneColMaxLength, true))
			);

	}
		
}
