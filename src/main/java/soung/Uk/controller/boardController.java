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
        return "board/write";
    }
    @PostMapping("/write")
    public String createBoard(@ModelAttribute BoardCreateDto boardCreateDto) {
        boardService.create(boardCreateDto);
        return "redirect:/board/List";
    }

    @GetMapping("/list")
    public String getBoardList(Model model) {
        List<BoardDto> boardList = boardService.getBoardList();
        model.addAttribute("boardList", boardList);
        return "board/list";
    }

    @GetMapping("/list/{id}")
    public String getBoardDetail(Model model, @PathVariable Long id) {
        BoardDto boardDto = boardService.getBoardDetail(id);
        model.addAttribute("boardDetail", boardDto);
        return "/board/list";
    }


}
