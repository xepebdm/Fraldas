package com.hackaton.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Row {

	private String index;
	private List<BigDecimal> content;
	
	public Row(String index){
		this.index = index;
		content = new ArrayList<>(10);
	}
	
	public String getIndex() {
		return index;
	}

	public List<BigDecimal> getContent() {
		return content;
	}

	public void addContent(BigDecimal value) {
		content.add(value);
	}
	
}
