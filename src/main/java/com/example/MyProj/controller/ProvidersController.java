package com.example.MyProj.controller;


import com.example.MyProj.model.Providers;
import com.example.MyProj.repository.ProvidersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    @GetMapping("/deleteProviders")
    public String deleteProviders(@RequestParam int trn)
    {
        repository.deleteById(trn);
        return "redirect:providers";
    }
    @GetMapping("/addProviders")
    public String addProviders()
    {
        return "addProviders";
    }
    @PostMapping("/addProviders")
    public String addProviders(@ModelAttribute Providers providers)
    {
        repository.save(providers);
        return "redirect:providers";
    }
    @GetMapping("/update-providers")
    public String update(@RequestParam int trn, Model model) {
        Providers providers = repository.findById(trn).get();
        model.addAttribute("providers", providers);
        return "update-providers";
    }

    @PostMapping("/update-providers")
    public String update(@ModelAttribute Providers providers) {
        repository.save(providers);
        return "redirect:providers";
    }
}
