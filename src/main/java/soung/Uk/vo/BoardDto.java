package soung.Uk.vo;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class BoardDto {

        private Long id; // PK
        private String title; // 제목
        private String content; // 내용
        private String writer; // 작성자
        private int hits; // 조회 수
        private char deleteYn; // 삭제 여부
        private LocalDateTime createdDate; // 생성일
        private LocalDateTime modifiedDate; // 수정일
}
