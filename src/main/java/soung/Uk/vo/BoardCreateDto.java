package soung.Uk.vo;

import ch.qos.logback.core.util.InvocationGate;
import lombok.*;


@Data
public class BoardCreateDto {

    private String title; // 제목
    private String content; // 내용
    private String writer; // 작성자
    private Integer hits; //조회수
    private char deleteYn; // 삭제 여부

}
