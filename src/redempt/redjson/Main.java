package redempt.redjson;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
	
	public static void main(String[] args) {
		try {
			String json = Files.readString(Paths.get("/home/redempt/Downloads/tmp/large-file.json"));
			JSONParser.parseList("[1, true, null, {}, 1.23]");
			long time = System.currentTimeMillis();
			JSONList list = JSONParser.parseList(json);
			System.out.println(System.currentTimeMillis() - time);
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}
	
}
