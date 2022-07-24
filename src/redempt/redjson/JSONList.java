package redempt.redjson;

import java.util.ArrayList;
import java.util.StringJoiner;

public class JSONList extends ArrayList<Object> {
	
	public JSONMap getMap(int index) {
		return (JSONMap) get(index);
	}
	
	public JSONList getList(int index) {
		return (JSONList) get(index);
	}
	
	
	@Override
	public String toString() {
		StringJoiner joiner = new StringJoiner(", ", "[", "]");
		forEach(o -> joiner.add(JSONParser.toJSONString(o)));
		return joiner.toString();
	}
	
}
