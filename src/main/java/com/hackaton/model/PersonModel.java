package com.hackaton.model;

import org.springframework.web.multipart.MultipartFile;

public class PersonModel {

	
	private Double age;
	private Double weight;
	
	//VALUE OF THE ROW INDEX WHERE THE WEIGHT ARE 
	private String rowIndex;
	
	//CHECK IF THE WEIGHT IS OK ( AGE AND WEIGHT IN THE SAME ROW-INDEX)
	private boolean weightOk = false;
	
	private String sex;
	private String diaperModel;
	private MultipartFile photo;
	private TableContentModel model;
	
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

	public String getRowIndex() {
		return rowIndex;
	}

	public void setRowIndex(String rowIndex) {
		this.rowIndex = rowIndex;
	}

	public boolean isWeightOk() {
		return weightOk;
	}

	public void setWeightOk(boolean weightOk) {
		this.weightOk = weightOk;
	}

	public Double getAge() {
		return age;
	}

	public void setAge(Double age) {
		this.age = age;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}
}
