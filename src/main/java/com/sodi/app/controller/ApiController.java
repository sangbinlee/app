package com.sodi.app.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RequestMapping("api/v1/user")
@Tag(name = "User API", description = "User API 입니다.")
@RestController
public class ApiController {

	@Value("${spring.application.name}")
	private String name;

	@Value("${spring.application.version}")
	private String version;

    @Tag(name = "User API")
    @Operation(summary = "User 생성", description = "User 정보를 생성합니다.")
	@GetMapping
	public Map<String, Object> appInfo() {
		Map<String, Object> map = new HashMap<>();
		map.put("name", "user");
		map.put("version", version);
		return map;
	}

}
