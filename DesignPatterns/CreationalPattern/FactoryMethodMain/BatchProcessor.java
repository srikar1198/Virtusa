package FactoryPattern;

import java.io.File;
import java.util.List;

public class BatchProcessor {
	public void processBatch(String fileName,String format) {
		File file = openFile(fileName);
		TextParser parser = null;
		
		if(format.equals("text")) {
			parser =	new TextParser(file);
		}
		else if(format.equals("csv")) {
			parser =	new CSVParser(file);   //first request addition by customer 
		}
		else if(format.equals("xml")) {
			parser =	new XMLParser(file);
		}
		List<Record> records = parser.parse();
		processRecords(records);
		writeSummary();
		closeFile(file);
	}

	
	private File openFile(String fileName) {
		System.out.println("Opened file..");
		return null;
	}


	private void processRecords(List<Record> records) {
		System.out.println("Processing.each record.db calls ,etc.");
	}
	private void writeSummary() {
		System.out.println("Wrote  batch summary - 0 failed.");
		
	}

	private void closeFile(File file) {
		System.out.println("Closed file");
		
	}

}
