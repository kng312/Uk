package soung.Uk.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Data
@ToString
public class BoardDto {

        private Long id; // PK
        private String title; // 제목
        private String content; // 내용
        private String writer; // 작성자
        private int hits; // 조회 수
        private char deleteYn; // 삭제 여부
        private LocalDate createDate; // 생성일
        private LocalDate modifiedDate; // 수정일
}
