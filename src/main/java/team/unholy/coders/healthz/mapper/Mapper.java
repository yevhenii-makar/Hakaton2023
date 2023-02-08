package team.unholy.coders.healthz.mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import team.unholy.coders.healthz.model.Board;

public class Mapper {
    public Board fromStringToBoard(String jsonString) throws JsonProcessingException {
//        Board board = new Board();
        ObjectMapper mapper = new ObjectMapper();
//        String[][] asArray = mapper.readValue(jsonString, String[][].class);
        Board board = mapper.readValue(jsonString, Board.class);
//
//        String[][] asArray = mapper.readValue(jsonString, String[][].class);
//        board.setBoard(asArray);
        return board;
    }
}
