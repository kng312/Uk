package soung.Uk.vo;

import lombok.Builder;
import lombok.Data;


@Data
public class BoardPatchDto {

    private Long id; // PK
    private String title; // 제목
    private String content; // 내용
    private String writer; // 작성자
    private String deleteYn; // 삭제 여부

    @Builder
    public BoardPatchDto(
            Long id,
                            String title,
                         String content,
                         String writer,
                         String deleteYn) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.deleteYn = "N";
    }

}
