package soung.Uk.mapper;

import org.apache.ibatis.annotations.Mapper;
import soung.Uk.vo.BoardCreateDto;
import soung.Uk.vo.BoardDto;
import soung.Uk.vo.BoardPatchDto;

import java.util.List;

@Mapper
public interface boardMapper {
    void insertBoard(BoardCreateDto boardCreateDto);

    List<BoardDto> getBoardList();

    BoardDto getBoardDetail(Long id);

    void deleteBoard(Long id);

    void patchBoard(BoardPatchDto boardPatchDto);

    BoardPatchDto getBoardPatch(Long id);

    void viewCount(Long id);
}
