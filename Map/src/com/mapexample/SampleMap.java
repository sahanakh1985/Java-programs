package com.mapexample;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class SampleMap {

	public static void main(String[] args) {
		LinkedHashMap<Object, Object> map = new LinkedHashMap<>();
		map.put(1, "Alpha");
		map.put("Beta", 2);
		map.put(3.5, 365836458L);
		map.put(null, null);
		map.put(null, "Mike");
		map.put(4, null);
		map.put(5, null);
		System.out.println(map);
		System.out.println(map.size()); // 6
		System.out.println(map.containsKey(3.5)); // true
		System.out.println(map.containsValue(3.5)); // false
		System.out.println(map.get(null)); // Mike
		System.out.println(map.get(10)); // null
		System.out.println(map.isEmpty()); // false
		map.remove("Beta");
		System.out.println(map);

		System.out.println("Printing map using lambda");
		map.forEach((k, v) -> {
			System.out.println(k + " " + v);
		});
	}

}
