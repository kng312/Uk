package soung.Uk.mapper;

import org.apache.ibatis.annotations.Mapper;
import soung.Uk.vo.BoardCreateDto;
import soung.Uk.vo.BoardDto;

import java.util.List;

@Mapper
public interface boardMapper {
    void insertBoard(BoardCreateDto boardCreateDto);

    List<BoardDto> getBoardList();
}
