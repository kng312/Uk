package soung.Uk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import soung.Uk.service.boardService;
import soung.Uk.vo.BoardCreateDto;
import soung.Uk.vo.BoardDto;

import java.util.List;

@Controller
@RequestMapping("/boards")
public class boardController {

    private final boardService boardService;


    public boardController(soung.Uk.service.boardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/write")
    public String write() {
        return "boards/write";
    }

    @PostMapping("/post/write")
    public String createBoard(@RequestBody BoardCreateDto boardCreateDto) {
        boardService.create(boardCreateDto);
        return "redirect:/boards/list";
    }

    @GetMapping("/list")
    public String getBoardList(Model model) {
        List<BoardDto> boardList = boardService.getBoardList();
        model.addAttribute("boardList", boardList);
        return "boards/list";
    }

    @GetMapping("/list/{id}")
    public String getBoardDetail(Model model, @PathVariable Long id) {
        BoardDto boardDto = boardService.getBoardDetail(id);
        model.addAttribute("boardDetail", boardDto);
        return "/boards/view";
    }


}
