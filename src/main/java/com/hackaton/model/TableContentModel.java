package com.hackaton.model;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class TableContentModel {
	
	private String title;
	private List<String> header;
	private List<Row> row;
	
	public TableContentModel(String title) {
		this.title = title;
		header = new ArrayList<>();
		row = new ArrayList<>();
	}

	public String getTitle() {
		return title;
	}

	public List<String> getHeader() {
		return header;
	}
	
	public void setContent(Elements tableSetContent) {
		for(Element element : tableSetContent) {
			
			if(element.attributes().get("scope").equals("row")) {
				row.add(new Row(element.text()));
				continue;
			}
			
			header.add(element.text());
		}
	}

	public List<Row> getRow() {
		return row;
	}

	public void setRow(List<Row> row) {
		this.row = row;
	}
	
	
	
}
