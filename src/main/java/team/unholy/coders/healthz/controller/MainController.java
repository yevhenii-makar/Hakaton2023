package team.unholy.coders.healthz.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import team.unholy.coders.healthz.model.ColumnResponseDto;
import team.unholy.coders.healthz.model.MoveDtoRequest;

@RestController
@RequestMapping(MainController.MAIN_URL)
public class MainController {

    public static final String MAIN_URL = "move" ;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public ColumnResponseDto get(@RequestBody MoveDtoRequest request) {
        System.out.println(request);
        return new ColumnResponseDto();
    }
}
