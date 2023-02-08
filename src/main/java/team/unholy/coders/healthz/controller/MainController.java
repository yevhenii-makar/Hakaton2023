package team.unholy.coders.healthz.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import team.unholy.coders.healthz.model.ColumnResponseDto;

@RestController
@RequestMapping(MainController.MAIN_URL)
public class MainController {

    public static final String MAIN_URL = "main" ;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public ColumnResponseDto get() {
        return new ColumnResponseDto();
    }
}
