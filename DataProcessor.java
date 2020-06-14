package covid19;

public class DataProcessor {
	
	private static final String FILE_PATH = "/Users/Home/Desktop/Edu/Discord/src/covid19/covid-19-data.json";
	
	
	public static void main(String[] args) {
		
		DataReader reader = new DataReader();
		reader.readData(FILE_PATH);
	}
}

