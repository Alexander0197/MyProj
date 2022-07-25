package com.example.MyProj.controller;

import com.example.MyProj.model.Products;
import com.example.MyProj.repository.ProductsRepository;
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
public class ProductsController {
    @Autowired
    ProductsRepository productsRepository;
    @Autowired
    ProvidersRepository providersRepository;

    @GetMapping("/productsAll")
    public String findAll(Model model)
   {
    List<Products> productsAll = productsRepository.findAll();
        model.addAttribute("productsAll", productsAll);
       return "productsAll";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam int vendorCode)
    {
        productsRepository.deleteById(vendorCode);
        return "redirect:productsAll";
    }
    @GetMapping("/addProducts")
    public String addProducts(Model model)
    {   model.addAttribute("providersAll", providersRepository.findAll());

        return "addProducts";
    }
    @PostMapping("/addProducts")
    public String addProducts(@ModelAttribute Products products)
    {
        productsRepository.save(products);
        return "redirect:productsAll";
    }
    @GetMapping("/update-products")
    public String update(@RequestParam int vendorCode, Model model) {
        Products products = productsRepository.findById(vendorCode).get();
        model.addAttribute("providersAll", providersRepository.findAll());
        model.addAttribute("products", products);
        return "update-products";
    }

    @PostMapping("/update-products")
    public String update(@ModelAttribute Products person) {
        productsRepository.save(person);
        return "redirect:productsAll";
    }

}
