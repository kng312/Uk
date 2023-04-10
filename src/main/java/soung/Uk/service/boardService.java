package soung.Uk.service;

import org.springframework.stereotype.Service;
import soung.Uk.mapper.boardMapper;
import soung.Uk.vo.BoardCreateDto;
import soung.Uk.vo.BoardDto;
import soung.Uk.vo.BoardPatchDto;

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
        List<BoardDto> board = boardMapper.getBoardList();
        return board;
    }

    public BoardDto getBoardDetail(Long id) {
        boardMapper.viewCount(id);
        return boardMapper.getBoardDetail(id);
    }

    public void deleteBoard(Long id) {
        boardMapper.deleteBoard(id);
    }

    public void patchBoard(BoardPatchDto boardPatchDto) {
        boardMapper.patchBoard(boardPatchDto);
    }

    public BoardPatchDto getBoardPatch(Long id) {
        return boardMapper.getBoardPatch(id);

    }
}
