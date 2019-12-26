package com.geekbrains.springbootproject.controllers;

import com.geekbrains.springbootproject.services.DiskHibService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    private DiskHibService diskHibService;

    @Autowired
    public void setDiskHibService(DiskHibService diskHibService) {
        this.diskHibService = diskHibService;
    }

    @GetMapping("/")
    public String showHomePage(Model model) {
        model.addAttribute("disks", diskHibService.getAllDisks());
        return "index";
    }
}
