package team.unholy.coders.healthz.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(healthzController.HEALTHZ_URL)
public class healthzController {
    public static final String HEALTHZ_URL = "healthz" ;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String get() {
        return "hi hackathon";
    }
}
