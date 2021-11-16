import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.bean.CsvToBeanBuilder;

public class csvreview {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String fileName = "C:\\Users\\Usuari\\Documents\\curs 2021-22\\DAM\\M6 - Accès a dades\\UF1 - Fitxers\\233_2.8_reviews_sentiment.csv";
		CSVParser csvParser = new CSVParserBuilder().withSeparator(';').build();
		CSVReader reader = new CSVReaderBuilder(
		          new FileReader(fileName))
		          .withCSVParser(csvParser)   // custom CSV parser
		          .withSkipLines(1)           // skip the first line, header info
		          .build();
		List<review> beans = new CsvToBeanBuilder(reader)
                .withType(review.class)
                .build()
                .parse();
		
		for (review review : beans) {
			if(!review.getReviewTitle().isEmpty()) {
				System.out.println(review.toString());
			}
		}
		
	}

}
