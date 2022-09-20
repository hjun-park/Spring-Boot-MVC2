package com.hello.thymeleaf.basic;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/basic")
public class BasicController {

    @GetMapping("text-basic")
    public String textBasic(Model model) {
        // 01-01. 의도는 진한 글씨였지만 이스케이프 기능으로 &lt;b&gt;Spring!&lt;/b&gt; 출력됨
        model.addAttribute("data", "Hello <b>Spring!</b>");

        return "basic/text-basic";
    }

    @GetMapping("text-unescaped")
    public String textUnescaped(Model model) {
        model.addAttribute("data", "Hello <b>Spring!</b>");

        return "basic/text-unescaped";
    }
}
