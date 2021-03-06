package com.hackaton.calculator;

import java.io.IOException;
import java.math.BigDecimal;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.hackaton.model.PersonModel;
import com.hackaton.model.Row;
import com.hackaton.model.TableContentModel;

public class PersonCalculator {

	private final String MAX_36_MONTHS = "https://www.cdc.gov/growthcharts/html_charts/wtageinf.htm";
	private final String MAX_240_MONTHS = "https://www.cdc.gov/growthcharts/html_charts/wtage.htm";

	public PersonModel createContent(PersonModel person) {

		try {

			String url = person.getAge() <= 36 ? MAX_36_MONTHS : MAX_240_MONTHS;

			Document doc = Jsoup.connect(url).get();

			Elements tableElements = doc.select("table");

			for (Element element : tableElements) {

				TableContentModel model = new TableContentModel(element.select("caption").text());

				// ONLY CREATE THE TABLE MODEL FOR THE SAME SEX OF HE CHILDREN
				if (model.getTitle().contains(person.getSex())) {

					model.setContent(element.select("tbody tr th"));

					Elements rowElements = element.select("tr");

					for (int i = 0; i < rowElements.size();) {

						Element row = rowElements.get(i);

						Elements rowItems = row.select("td");

						if (!rowItems.isEmpty()) {
							
							for (int j = 0; j < rowItems.size(); j++) {
								model.getRow().get(i).addContent(new BigDecimal(rowItems.get(j).text()));
							}
							
							i++;
							continue;
						}

						rowElements.remove(i);
					}

					person.setModel(model);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return person;
	}
	
	public void checkRow(PersonModel person) {
		
		String ageIndex = person.getAge().toString();
		
		BigDecimal personWeight = new BigDecimal(person.getWeight());
		
		for(Row linha : person.getModel().getRow()) {
			
			BigDecimal firstDecimal = linha.getContent().get(0);
			BigDecimal lastDecimal = linha.getContent().get(linha.getContent().size() - 1);
			
			if (linha.getAgeIndex().equals(ageIndex)) {
				//COMPARE THE SMALL VALUE OF THE WEIGHT IN THE TABLE
				if (firstDecimal.compareTo(personWeight) <= 0
						//COMPARE THE BIGEST VALUE OF THE WEIGHT IN THE TABLE
						&& lastDecimal.compareTo(personWeight) >= 0) {
					
					person.setRowIndex(linha.getAgeIndex());
					person.setWeightOk(true);
					break;
				}
			}
			
		}//FIM FOR
	}
}
