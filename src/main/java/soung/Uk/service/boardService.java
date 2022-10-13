package soung.Uk.service;

import org.springframework.stereotype.Service;
import soung.Uk.mapper.boardMapper;
import soung.Uk.vo.BoardCreateDto;
import soung.Uk.vo.BoardDto;

import java.util.List;

@Service
public class boardService {

    private final boardMapper boardMapper;

    public boardService(soung.Uk.mapper.boardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    public void create(BoardCreateDto boardCreateDto) {
        boardMapper.insertBoard(boardCreateDto);
    }

    public List<BoardDto> getBoardList() {
        return boardMapper.getBoardList();
    }

    public BoardDto getBoardDetail(Long id) {
        boardMapper.viewCount(id);
        return boardMapper.getBoardDetail(id);
    }

    public void updateBoard(BoardDto boardDto) {
        boardMapper.updateBoard(boardDto);
    }

    public void deleteBoard(Long id) {
        boardMapper.deleteBoard(id);
    }
}
