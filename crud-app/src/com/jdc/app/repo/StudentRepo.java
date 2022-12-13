package com.jdc.app.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.jdc.app.entity.Student;

public class StudentRepo {
	
	private List<Student> repo;
	private static StudentRepo INSTANCE;
	
	public static StudentRepo getInstance() {
		return null == INSTANCE ? INSTANCE = new StudentRepo() : INSTANCE;
	}
	
	private StudentRepo() {
		repo = new ArrayList<>();
	}

	public void add(Student data) {
		if(!Objects.isNull(data))
			repo.add(data);
	}

	public void update(int id, Student newData) {
		if(!Objects.isNull(newData))
			repo.set(findIndex(id), newData);
	}

	public void delete(int id) {
		if(id > 0)
			repo.remove(findIndex(id));
	}

	public Student findById(int id) throws IndexOutOfBoundsException {
	
		if(id > 0)
			return repo.get(findIndex(id));
		
		return null;
	}

	public List<Student> findAll() {
		return new ArrayList<Student>(repo);
	}
	
	private int findIndex(int id) {
		
		int index = -1;
		
		for(Student stu : repo) {
			if(stu.getId() == id)
				index = repo.indexOf(stu);
		}
		
		return index;
	}

}
