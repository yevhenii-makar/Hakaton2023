package team.unholy.coders.healthz.model;

import java.util.List;
import lombok.Data;

@Data
public class MoveDtoRequest {

    private String gameId;
    private List<List<String>> board;
    private String player;

}
