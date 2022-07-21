package com.example.MyProj.controller;

import com.example.MyProj.model.Providers;
import com.example.MyProj.repository.ProvidersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProvidersController {

    @Autowired
    ProvidersRepository repository;

    @GetMapping("/providers")
    public String findAll(Model model)
    {
        List<Providers> providersAll = repository.findAll();
        model.addAttribute("providersAll", providersAll);
        return "providers";
    }
}
