package de.pentasys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Simon Schober <simon.schober@live.com>
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "de.pentasys")
public class Pilot extends SpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(Pilot.class, args);
    }
}
