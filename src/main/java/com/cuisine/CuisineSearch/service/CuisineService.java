package com.cuisine.CuisineSearch.service;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CuisineService {
	
	private static final Logger log = LoggerFactory.getLogger(CuisineService.class);
	
	RestTemplate restTemplate = new RestTemplate();
	final String baseUrl = "https://api.edamam.com/api/recipes/v2?type={type}&q={q}&app_id={app_id}&app_key={app_key}";
	
	
	public ResponseEntity<String> getRecipes(String cuisine, String city){
		
		log.info("Endpoint: "+ baseUrl);
		log.info("Cuisine: "+ cuisine);
		log.info("City: "+ city);
		
		Map<String,String> params = new HashMap<>();
		params.put("type", "public");
		params.put("q", cuisine);
		params.put("app_id", "411ec584");
		params.put("app_key", "fd9847036547bccc34a587aedd74f105");
		 
		ResponseEntity<String> result = restTemplate.getForEntity(baseUrl, String.class, params);
		
		return result;
	}

}
