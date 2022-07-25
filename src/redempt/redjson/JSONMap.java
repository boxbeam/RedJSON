package redempt.redjson;

import java.util.HashMap;
import java.util.StringJoiner;

public class JSONMap extends HashMap<String, Object> {
	
	public Integer getInt(String key) {
		Object o = get(key);
		if (o instanceof Long) {
			return (int) (long) o;
		}
		return (Integer) o;
	}
	
	public Boolean getBoolean(String key) {
		return (Boolean) get(key);
	}
	
	public Double getDouble(String key) {
		return (Double) get(key);
	}
	
	public Long getLong(String key) {
		return (Long) get(key);
	}
	
	public JSONList getList(String key) {
		return (JSONList) get(key);
	}
	
	public JSONMap getMap(String key) {
		return (JSONMap) get(key);
	}
	
	public String getString(String key) {
		return (String) get(key);
	}
	
	@Override
	public String toString() {
		StringJoiner joiner = new StringJoiner(", ", "{", "}");
		forEach((key, value) -> joiner.add(JSONParser.toJSONString(key) + ": " + JSONParser.toJSONString(value)));
		return joiner.toString();
	}

}
