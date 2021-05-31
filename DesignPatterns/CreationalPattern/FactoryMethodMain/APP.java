package FactoryPattern;

public class APP {

	public static void main(String[] args) {
		BatchProcessor batchProcessor = new BatchProcessor();
		batchProcessor.processBatch(args[0],args[1]);
		System.out.println("Done.");
	}

}
