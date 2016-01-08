package com.example.commonadapter;

/**
 * Created by shishaocong on 15/11/16.
 */
public class Grade {
	private String id;
	private String name;
	private int index;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public Grade(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Grade(String id, String name, int index) {
		super();
		this.id = id;
		this.name = name;
		this.index = index;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
