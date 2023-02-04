package team.unholy.coders.healthz.model;

import lombok.Data;

@Data
public class MoveDtoRequest {

    private String gameId;
    private String board;
    private String player;

}
