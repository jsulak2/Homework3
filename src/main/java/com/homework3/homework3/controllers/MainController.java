package com.homework3.homework3.controllers;

import com.homework3.homework3.Models.InventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;


@Controller
public class MainController
{
    @Autowired
    InventoryRepo inventoryRepo;

    @RequestMapping("/")
    public ModelAndView doHome(){
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("inventorylist", inventoryRepo.findAll());
        return mv;
    }
}
