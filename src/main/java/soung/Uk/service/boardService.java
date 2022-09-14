package soung.Uk.service;

import org.springframework.stereotype.Service;
import soung.Uk.mapper.boardMapper;
import soung.Uk.vo.BoardCreateDto;

@Service
public class boardService {

    private final boardMapper boardMapper;

    public boardService(soung.Uk.mapper.boardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    public void create(BoardCreateDto boardCreateDto) {
        boardMapper.insertBoard(boardCreateDto);
    }
}
