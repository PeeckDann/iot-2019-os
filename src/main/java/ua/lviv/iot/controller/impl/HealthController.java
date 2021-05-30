package ua.lviv.iot.controller.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/healthcheck")
public class HealthController {
	  
	  @GetMapping("")
	    public ResponseEntity returnHealthCheckResponse() {
		          return new ResponseEntity<>("App is Healthy", HttpStatus.OK);
			    }
}
