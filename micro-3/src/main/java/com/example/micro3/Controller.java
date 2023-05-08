package com.example.micro3;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class Controller {
	private static final Logger LOGGER = LoggerFactory.getLogger(Controller.class);

	private RestTemplate restTemplate;

	@Autowired
	public Controller(RestTemplateBuilder builder) {
		this.restTemplate = builder.build();
	}
	
	@GetMapping(path = "/micro-3")
    public String getPrueba(@RequestHeader Map<String, String> headers) {
        headers.forEach((key, value) -> {
        	LOGGER.info(String.format("Header '%s' = %s", key, value));
        });
        LOGGER.info("Inicio test micro-3");
       /* RestTemplate restTemplate = new RestTemplate();
        String resourceUrl
          = "http://localhost:8081/micro-3";
        ResponseEntity<String> response
          = restTemplate.getForEntity(resourceUrl, String.class);
        LOGGER.info("Respuesta micro-3" + response.toString());*/
        LOGGER.info("Fin test micro-3");
        return "Test micro-3";
    }
}
