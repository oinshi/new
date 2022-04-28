package com.telstra.assignment.constant;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class CustomResponseMapUtil {
	private static Map<String, Object> responseMap = new HashMap<String, Object>();

	static {
		
		responseMap.put("code", "NSP000");
		responseMap.put("message", "SUCCESS");
		responseMap.put("data", null);
		responseMap.put("errors", null);
	}

	public synchronized static Map<String,Object> getCustomResponseMap(){
		String json = new Gson().toJson(responseMap);
		Map<String, Object> mapCopy = new Gson().fromJson(
		    json, new TypeToken<Map<String, Object>>() {}.getType());
		return mapCopy;
	}

}
