package de.pentasys.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Simon Schober <simon.schober@live.com>
 */
@RestController
@RequestMapping("/api")
public class Controller {

    @RequestMapping(value="/pilot", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> loadTestData() {
        return new ResponseEntity<>("This is some stuff from the backend", HttpStatus.OK);
    }
}
