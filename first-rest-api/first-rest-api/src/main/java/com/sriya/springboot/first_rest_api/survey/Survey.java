package com.sriya.springboot.first_rest_api.survey;

import java.util.List;

public class Survey {
	
	public String getId() {
		return id;
	}

	public Survey(String id, String title, String description, List<Question> questions) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		Questions = questions;
	}

	public Survey() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public List<Question> getQuestions() {
		return Questions;
	}

	private String id;
	private String title;
	private String description;
	private List<Question> Questions;
	@Override
	public String toString() {
		return "Survey [id=" + id + ", title=" + title + ", description=" + description + ", Questions=" + Questions
				+ "]";
	}
}
