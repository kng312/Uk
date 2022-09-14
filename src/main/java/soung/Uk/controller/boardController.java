package soung.Uk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import soung.Uk.service.boardService;
import soung.Uk.vo.BoardCreateDto;

@Controller
@RequestMapping("/board")
public class boardController {

    private final boardService boardService;


    public boardController(soung.Uk.service.boardService boardService) {
        this.boardService = boardService;
    }

    @PostMapping("/create")
    public String createBoard(@ModelAttribute BoardCreateDto boardCreateDto) {
        boardService.create(boardCreateDto);
        return "/boardList";

    }


}
