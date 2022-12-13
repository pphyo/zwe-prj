package com.jdc.app.repo;

import java.util.List;

public interface BaseRepo<T> {

	// add to database
	void add(T data);
	// edit
	void update(int id, T newData);
	// delete
	void delete(int id);
	// find by id
	T findById(int id);
	// find all
	List<T> findAll();
	
}
