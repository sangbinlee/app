package com.sodi.app.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1")
@RestController
public class ApiUserController {

	@Value("${spring.application.name}")
	private String name;

	@Value("${spring.application.version}")
	private String version;

	@GetMapping
	public Map<String, Object> appInfo() {
		Map<String, Object> map = new HashMap<>();
		map.put("name", name);
		map.put("version", version);
		return map;
	}

}
