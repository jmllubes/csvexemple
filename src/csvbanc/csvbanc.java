package csvbanc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.bean.CsvToBeanBuilder;

public class csvbanc {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String fileName = "C:\\Users\\Usuari\\Documents\\curs 2021-22\\DAM\\M6 - Accès a dades\\UF1 - Fitxers\\1000 BT Records.csv";
		CSVReader reader = new CSVReaderBuilder(new FileReader(fileName)) // custom CSV parser
				.withSkipLines(1) // skip the first line, header info
				.build();
		List<transaccio> beans = new CsvToBeanBuilder(reader).withType(transaccio.class).build().parse();
		double total = 0;
		for (transaccio transaccio : beans) {
			
			System.out.println( Double.parseDouble(transaccio.getDeposits().replace(",", "")));
		}
		System.out.println(total);
	}

}
