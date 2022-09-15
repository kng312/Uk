package soung.Uk.vo;

import ch.qos.logback.core.util.InvocationGate;
import lombok.*;


@Data
public class BoardCreateDto {

    private String title; // 제목
    private String content; // 내용
    private String writer; // 작성자
    private String deleteYn; // 삭제 여부

    @Builder
    public BoardCreateDto(String title,
                          String content,
                          String writer,
                          String deleteYn) {
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.deleteYn = "N";
    }

}
