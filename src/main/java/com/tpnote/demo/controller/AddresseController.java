package com.tpnote.demo.controller;

import com.tpnote.demo.model.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddresseController {
    @GetMapping("/addresse")
    public String greeting(@RequestParam(name="nameGET", required=false, defaultValue="World") String
                                   nameGET, Model model) {
        model.addAttribute("nomTemplate", nameGET);
        return "addresse";
    }
}
