package soung.Uk.mapper;

import org.apache.ibatis.annotations.Mapper;
import soung.Uk.vo.BoardCreateDto;

@Mapper
public interface boardMapper {
    void insertBoard(BoardCreateDto boardCreateDto);
}
