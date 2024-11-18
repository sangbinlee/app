package com.sodi.app.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

	@Value("${spring.application.name}")
	private String name;

	@Value("${spring.application.version}")
	private String version;

	@GetMapping
	public Map<String, Object> home() {
		Map<String, Object> map = new HashMap<>();
		map.put("name", name);
		map.put("version", version);
		return map;
	}

}
