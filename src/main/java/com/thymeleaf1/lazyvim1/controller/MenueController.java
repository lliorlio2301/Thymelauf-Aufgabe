package com.thymeleaf1.lazyvim1.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenueController {
  private static List<String> jorgeiros = List.of("jorge", "osorio", "salazar");

  @GetMapping("/Hauptfenster")
  public String menueFenster(Model model) {
    model.addAttribute("lahoradelJorge", LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm")));
    model.addAttribute("listevonjorge", jorgeiros);
    return "menueFenster";
  }
}
