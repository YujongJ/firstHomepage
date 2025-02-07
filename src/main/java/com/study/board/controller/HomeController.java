package com.study.board.controller;

import com.study.board.dto.BoardDTO;
import com.study.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final BoardService boardService;

    @GetMapping("/")
    public String home(Model model) {
        List<BoardDTO> top5Posts = boardService.findTop5();
        System.out.println("HomeController에서 받은 데이터: " + top5Posts);
        model.addAttribute("top5Posts", top5Posts);
        System.out.println("HomeController.home");
        return "home";
    }



    @GetMapping("/info")
    public String info() {
        System.out.println("HomeController.info");
        return "info";
    }

    @GetMapping("/work")
    public String work() {
        System.out.println("HomeController.work");
        return "work";
    }

    @GetMapping("/project1")
    public String project1() {
        System.out.println("HomeController.project1");
        return "project1";
    }

    @GetMapping("/project2")
    public String project2() {
        System.out.println("HomeController.project2");
        return "project2";
    }

    @GetMapping("/project3")
    public String project3() {
        System.out.println("HomeController.project3");
        return "project3";
    }

    @GetMapping("/project4")
    public String project4() {
        System.out.println("HomeController.project4");
        return "project4";
    }

    @GetMapping("/project5")
    public String project5() {
        System.out.println("HomeController.project5");
        return "project5";
    }

    @GetMapping("/project6")
    public String project6() {
        System.out.println("HomeController.project6");
        return "project6";
    }



}
