package com.hackaton.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Row {

	private String ageIndex;
	private List<BigDecimal> content;
	
	public Row(String ageIndex){
		this.ageIndex = ageIndex;
		content = new ArrayList<>(10);
	}
	
	public String getAgeIndex() {
		return ageIndex;
	}

	public List<BigDecimal> getContent() {
		return content;
	}

	public void addContent(BigDecimal value) {
		content.add(value);
	}
	
}
