package com.hackaton;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.hackaton.model.TableContentModel;

public class TesteHtml {

	public static void main(String[] args) {
		String html = "https://www.cdc.gov/growthcharts/html_charts/wtageinf.htm";

		try {
			
			Document doc = Jsoup.connect(html).get();
			Elements tableElements = doc.select("table");
			
			
			for(Element element : tableElements) {
//				String string = element.select("caption").text();
				TableContentModel model = new TableContentModel(element.select("caption").text());
				model.setContent(element.select("tbody tr th"));
				
				Elements rowElements = element.select(":not(thead) tr");
				
				for (int i = 0; i < rowElements.size(); i++) {
//					model.getRow().get(i).setContent(rowElements.get(i).text());
				}
				
//				String string = element.attributes().get("caption");
//				System.out.println(string);
			}
//			tableElements.select("caption");
//
//			
//			Elements tableHeaderEles = tableElements.select("tbody tr th");
//			
			
//			for (int i = 0; i < model.getHeader().size(); i++) {
//				System.out.println(model.getHeader().get(i));
//			}
			
//			System.out.println();
//
//			Elements tableRowElements = tableElements.select(":not(thead) tr");
//
//			for (int i = 0; i < tableRowElements.size(); i++) {
//				Element row = tableRowElements.get(i);
//				System.out.println("row");
//				Elements rowItems = row.select("td");
//				for (int j = 0; j < rowItems.size(); j++) {
//					System.out.println(rowItems.get(j).text());
//				}
//				System.out.println();
//			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
