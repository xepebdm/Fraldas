package com.hackaton.model;

import java.util.List;

public class Row {

	private String text;
	private List<String> content;
	
	public Row(String text){
		this.text = text;
	}
	
	public String getText() {
		return text;
	}
	
//	public void setText(String text) {
//		this.text = text;
//	}
	
	public List<String> getContent() {
		return content;
	}
	
	public void setContent(List<String> content) {
		this.content = content;
	}
	
	
}
