package kr.co.greenuniversity.controller;

import kr.co.greenuniversity.dto.PageRequestDTO;
import kr.co.greenuniversity.service.CommunityService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@RequiredArgsConstructor
@Controller
public class CommunityController {

    private CommunityService communityService;

    @GetMapping("/article/list")
    public String list(Model model, PageRequestDTO pageRequestDTO) {




        return "/article/list";
    }
}
