package soung.Uk.controller;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import soung.Uk.service.boardService;
import soung.Uk.vo.BoardCreateDto;
import soung.Uk.vo.BoardDto;
import soung.Uk.vo.BoardPatchDto;

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
    public String createBoard(BoardCreateDto boardCreateDto) {
        boardService.create(boardCreateDto);
        return "redirect:/boards/list";
    }

    @GetMapping("/list")
    public String getBoardList(Model model) {
        List<BoardDto> boardList = boardService.getBoardList();
        model.addAttribute("boardsList", boardList);
        return "/boards/list";
    }
    //깃 작업 한번 해보자
//깃 작업 한번 해보자 머지를 추가해보자
    @GetMapping("/list/{id}")
    public String getBoardDetail(Model model, @PathVariable Long id) {
        BoardDto boardDto = boardService.getBoardDetail(id);
        model.addAttribute("boardDetail", boardDto);
        return "boards/view";
    }

    @GetMapping("/update/{id}")
    public String getUpdateBoard(Model model, @PathVariable Long id) {
        BoardDto boardDto = boardService.getBoardDetail(id);
        model.addAttribute("boardUpdate", boardDto);
        return "boards/update";
    }


    @PostMapping("/delete/{id}")
    public String deleteBoard (@PathVariable Long id) {
        boardService.deleteBoard(id);
        return "redirect:/boards/list";
    }

    @GetMapping("/patch/view/{id}")
    public String patchView (Model model, @PathVariable Long id) {
        BoardPatchDto dto = boardService.getBoardPatch(id);
        model.addAttribute("patch", dto);
        return "/boards/patch";
    }

    @PostMapping("/patch")
    public String patchBoard (@RequestBody BoardPatchDto boardPatchDto) {
        boardService.patchBoard(boardPatchDto);
        return "/boards/list";
    }


}
