package com.example.taskmanage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/Task")
public class TaskManageController {
    @GetMapping
    public String Task(Model model) {
        model.addAttribute("name", "HelloWorld");
        return "index.html";
    }
}
