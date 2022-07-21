package com.example.MyProj.controller;

import com.example.MyProj.model.Products;
import com.example.MyProj.repository.ProductsRepository;
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
    ProductsRepository repository;

    @GetMapping("/products")
    public String findAll(Model model)
   {
    List<Products> productsAll = repository.findAll();
        model.addAttribute("productsAll", productsAll);
       return "products";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam int vendorCode)
    {
        repository.deleteById(vendorCode);
        return "redirect:products";
    }
    @GetMapping("/addProducts")
    public String addProducts()
    {
        return "addProducts";
    }
    @PostMapping("/addProducts")
    public String addProducts(@ModelAttribute Products products)
    {
        repository.save(products);
        return "redirect:products";
    }
}
