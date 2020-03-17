package com.madschristensen.binarydecimalconverter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("conversion", new Conversion());
        return "index";
    }

    @PostMapping("/")
    public String indexSubmit(@ModelAttribute Conversion conversion, Model model) {
        model.addAttribute("conversion", conversion);
        return "result";
    }
}
