package com.thymeleaf1.lazyvim1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.thymeleaf1.lazyvim1.model.Text;

@Controller
public class KommentareController {

  @GetMapping("/Kommentare")
  public String kommentareFenster(Model model) {
    model.addAttribute("text", new Text());
    return "kommentare";
  }

  @PostMapping("/Speicherung")
  public String textSpeicherung(@ModelAttribute("text") Text text) {
    System.out.println(text);
    return "menueFenster";
  }
}
