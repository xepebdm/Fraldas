package com.hackaton;

import java.io.IOException;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.hackaton.model.Row;
import com.hackaton.model.TableContentModel;

public class TesteHtml {

	public static void main(String[] args) {
		String html = "https://www.cdc.gov/growthcharts/html_charts/wtageinf.htm";

		try {

			Document doc = Jsoup.connect(html).get();
			Elements tableElements = doc.select("table");

			for (Element element : tableElements) {
				
				TableContentModel model = new TableContentModel(element.select("caption").text());
				model.setContent(element.select("tbody tr th"));

				Elements tableRowElements = element.select(":not(thead) tr");
				List<Row> linhas = model.getRow();
				
//				for (Element row : tableRowElements) {
				for(int i = 0; i < tableRowElements.size(); i++) {
					linhas.get(i).setContent(tableRowElements.get(i).text());
				}
//					Elements rowItems = row.select("td");
//					
//					for (int j = 0; j < rowItems.size(); j++) {
//						linhas.get(j).setContent(rowItems.eachText());
//						
//					}
				

			}
//			tableElements.select("caption");
//
//			
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
