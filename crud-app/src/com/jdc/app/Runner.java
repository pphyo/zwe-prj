package com.jdc.app;

import static com.jdc.app.util.CommonUtil.*;

import java.util.List;
import java.util.Objects;

import com.jdc.app.entity.Student;
import com.jdc.app.entity.Student.Gender;
import com.jdc.app.entity.Student.Grade;
import com.jdc.app.entity.User;
import com.jdc.app.repo.StudentRepo;
import com.jdc.app.repo.UserRepo;
import com.jdc.app.util.OutputFormatUtil;

public class Runner {
	
	private static final String[] loginPage = {"Log In", "Sign Up", "Exit"};
	private static final String[] appPage = {"Add Student", "Edit Student", "Delete Student", "Find By Id", "Find All", "Log out"};
	
	private UserRepo userRepo;
	private StudentRepo stuRepo;
	
	public Runner() {
		userRepo = UserRepo.getInstance();
		stuRepo = StudentRepo.getInstance();
	}
	
	public void run() {
		// show title
		printHeaderFooter("Welcome");
			
		start();
			// sign in
				// get username
				// get password
				// check username and password
				// if successful, go to app
				// .........
			
			// sign up
				// get username
				// get password
				// save database
				
	}
	
	private void start() {
		breakLine();
		
		setOrder(loginPage);
			
		int code = chooseOpt();
			
		chooseLoginOpt(code);
	}
	
	private void chooseLoginOpt(int code) {
		switch (code) {
			case 1:
				logIn();
				break;
			case 2:
				signUp();
				break;
			case 3:
				breakLine();
				printHeaderFooter("Thank you so much");
				System.exit(0);
				break;
			default:
				breakLine();
				System.out.println("Wrong Option!");
				start();
		}
			
	}
	
	private void logIn() {
		
		if(userRepo.getRepo().isEmpty()) {
			breakLine();
			System.out.println("There is no register user. Please Sign Up!");			
			signUp();
			
		} else {
		
			breakLine();
			printHeaderFooter("Log In");
			breakLine();
			
			User user = getUser();
			
			if(userRepo.checkUser(user)) {
				// go to app
				doBusiness();
				
			} else {
				
				breakLine();
				System.out.println("User not found. Please enter correct data!");
				logIn();
			}
		}
		
	}
	
	private void signUp() {
		breakLine();
		printHeaderFooter("Sign Up");
		breakLine();
		
		User user = getUser();
		
		if(!Objects.isNull(user)) {
			userRepo.add(user);
			
			breakLine();
			System.out.println("User Registered Successfully...");
			
			start();
		}
		
	}
	
	private void doBusiness() {
		breakLine();
		
		printHeaderFooter("Welome to my Student CRUD APP");
		
		do {
			breakLine();
			setOrder(appPage);
			
			int code = chooseOpt();
			
			chooseAppOpt(code);
			
		} while (wantToContinue().equalsIgnoreCase("y"));
		
		breakLine();
		
		printHeaderFooter("Thank you so much");
		
	}
	
	private String wantToContinue() {
		breakLine();
		return getString("Do you want to continue?(y/others): ");
	}
	
	private int chooseOpt() {
		breakLine();
		
		int opt = getInt("Choose option: ");
		
		return opt;
	}
	
	private void breakLine() {
		System.out.println();
	}
	
	private User getUser() {
		String username = getString("Please enter user name: ");
		String password = getString("Please enter password: ");
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		return user;
	}
	
	private void chooseAppOpt(int code) {
		switch (code) {
			case 1:
				add();
				break;
			case 2:
				update();
				break;
			case 3:
				delete();
				break;
			case 4:
				findById();
				break;
			case 5:
				findAll();
				break;
			case 6:
				start();
				break;
			default:
				System.out.println("Wrong Option");
			
		}
	}
	
	private void add() {
		try {
			Student stu = getStudent(0);
			stuRepo.add(stu);
		} catch (NumberFormatException e) {
			breakLine();
			System.out.println("Please enter digit only for age!");
			add();
		} catch (Exception e) {
			breakLine();
			System.out.println(e.getMessage());
			add();
		}

		breakLine();
		System.out.println("New student successfully added...");
		
	}
	
	private void update() {
		breakLine();
		int id = getInt("Enter student id you want to edit: ");
		
		try {
			Student newData = getStudent(id);
			
			stuRepo.update(id, newData);
			
		} catch (NumberFormatException e) {
			breakLine();
			System.out.println("Please enter digit only for age!");
			add();
		} catch (Exception e) {
			breakLine();
			System.out.println(e.getMessage());
			add();
		}
		
		breakLine();
		System.out.println("Student successfully updated...");
	}
	
	private void delete() {
		breakLine();
		int id = getInt("Enter student id you want to delete: ");
		stuRepo.delete(id);
		
		breakLine();
		System.out.println("Student successfully deleted...");
	}
	
	private void findById() {
		breakLine();
		int id = getInt("Enter student id: ");
		
		try {
			Student result = stuRepo.findById(id);
			
			if(Objects.isNull(result)) {
				breakLine();
				System.out.println("There is no student with your id!");
			} else {
				breakLine();
				// show result
				
				OutputFormatUtil.printTable(List.of(result));
			}
		} catch (Exception e) {
			breakLine();
			System.out.println("There is no student with your id!");
		}
		
	}
	
	private void findAll() {
		List<Student> result = stuRepo.findAll();
		
		if(result.isEmpty()) {
			breakLine();
			System.out.println("There is no student in list!");
		} else {
			breakLine();
			OutputFormatUtil.printTable(result);
		}
	}
	
	private Student getStudent(int id) {
		breakLine();
		String name = getString("Please enter name: ");
		if(isEmpty(name))
			throw new RuntimeException("Name can't be empty!");
		
		Gender gender = getGender();
		
		breakLine();
		int age = getInt("Please enter age: ");
		if(age <= 0)
			throw new RuntimeException("Age must be greater than zero!");
		
		Grade grade = getGrade();
		
		breakLine();
		String phone = getString("Enter phone no: ");
		if(isEmpty(name))
			throw new RuntimeException("Phone can't be empty!");
		
		Student stu = null;
		
		if(id > 0) {
			stu = stuRepo.findById(id);
		} else {
			stu = new Student();
		}
		
		stu.setName(name);
		stu.setGender(gender);
		stu.setAge(age);
		stu.setGrade(grade);
		stu.setPhone(phone);
		
		return stu;
	}
	
	private Gender getGender() {
		
		System.out.println("Please select gender:");
		Gender[] genders = Gender.values();
		
		breakLine();
		setOrder(genders);
		
		int code = 0;
		
		try {
			code = chooseOpt();
		} catch (Exception e) {
			System.out.println("Please enter digit for this!");
			getGender();
		}
		
		Gender gender = null;
		
		switch(code) {
			case 1:
				gender = Gender.Male;
				break;
			case 2:
				gender = Gender.Female;
				break;
			case 3:
				gender = Gender.Other;
				break;
			default:
				System.out.println("Wrong Option. Please select again!");
				getGender();
		}
		
		return gender;
	}
	
	private Grade getGrade() {
		
		System.out.println("Please select grade:");
		Grade[] grades = Grade.values();
		
		breakLine();
		setOrder(grades);
		
		int code = chooseOpt();
		
		Grade g = null;
		
		switch(code) {
			case 1:
				g = Grade.KG;
				break;
			case 2:
				g = Grade.G1;
				break;
			case 3:
				g = Grade.G2;
				break;
			case 4:
				g = Grade.G3;
				break;
			case 5:
				g = Grade.G4;
				break;
			case 6:
				g = Grade.G5;
				break;
			case 7:
				g = Grade.G6;
				break;
			case 8:
				g = Grade.G7;
				break;
			default:
				System.out.println("Wrong Option. Please select again!");
				getGrade();
		}
		
		
		return g;
		
	}

}
