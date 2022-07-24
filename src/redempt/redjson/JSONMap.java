package redempt.redjson;

import java.util.HashMap;
import java.util.StringJoiner;

public class JSONMap extends HashMap<String, Object> {

	public JSONMap getMap(String key) {
		return (JSONMap) get(key);
	}
	
	public JSONList getList(String key) {
		return (JSONList) get(key);
	}
	
	@Override
	public String toString() {
		StringJoiner joiner = new StringJoiner(", ", "{", "}");
		forEach((key, value) -> joiner.add(JSONParser.toJSONString(key) + ": " + JSONParser.toJSONString(value)));
		return joiner.toString();
	}

}
