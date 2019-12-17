package com.hackaton.model;

import org.springframework.web.multipart.MultipartFile;

public class PersonModel {

	
	private Integer age;
	private Integer weight;
	private String sex;
	private String diaperModel;
	private MultipartFile photo;
	private TableContentModel model;
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Integer getWeight() {
		return weight;
	}
	
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public MultipartFile getPhoto() {
		return photo;
	}
	
	public void setPhoto(MultipartFile photo) {
		this.photo = photo;
	}

	public String getDiaperModel() {
		return diaperModel;
	}

	public void setDiaperModel(String diaperModel) {
		this.diaperModel = diaperModel;
	}

	public TableContentModel getModel() {
		return model;
	}

	public void setModel(TableContentModel model) {
		this.model = model;
	}
}
