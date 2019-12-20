package com.hackaton.model;


public class Row {

	private String index;
	private String content;
	
	public Row(String index){
		this.index = index;
	}
	
	public String getIndex() {
		return index;
	}
	
//	public void setText(String text) {
//		this.text = text;
//	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
