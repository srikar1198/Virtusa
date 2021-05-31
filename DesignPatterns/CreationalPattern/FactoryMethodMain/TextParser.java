package FactoryPattern;

import java.io.File;
import java.util.List;

public class TextParser {
	
	public TextParser(){}

	public TextParser(File file) {
		System.out.println("Creating TEXT parser");
	}

	public List<Record> parse() {
		
		System.out.println("Parsing TEX and creating record list");
		
		return null;
	}

}
