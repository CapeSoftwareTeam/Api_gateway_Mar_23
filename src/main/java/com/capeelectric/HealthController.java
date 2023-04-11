package com.capeelectric;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HealthController {

	@GetMapping(value = "/health")
	public ResponseEntity<?> health() throws Exception {
		try {
			return ResponseEntity.status(200).body("Ok");
		} catch (Exception e) {
			return (ResponseEntity<?>) ResponseEntity.internalServerError().body(e.getMessage());
		}
	}

	@GetMapping(value = "/getservice")
	public ResponseEntity<?> getValue() {
		return new ResponseEntity<String>("Api-gateway service", HttpStatus.OK);
	}

}
