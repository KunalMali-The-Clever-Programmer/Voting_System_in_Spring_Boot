package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Nominee;
import com.example.demo.entity.Voter;
import com.example.demo.service.NomineeService;

@Controller
public class NomineeController {

    @Autowired
    private NomineeService nomineeService;

//    
//    @GetMapping("/adminDashboard")
//    public String showAdminDashboard(Model model) {
//        model.addAttribute("voters", nomineeService.getAllNominees());
//        return "adminDashboard";
//    }
//    
    @GetMapping("/nominees")
    public String viewNominees(Model model) {
        List<Nominee> nominees = nomineeService.getAllNominees();
        model.addAttribute("nominees", nominees);
        return "nomineeList"; // This will look for nomineeList.html
    }

    @GetMapping("/nominees/add")
    public String showAddNomineeForm(Model model) {
        model.addAttribute("nominee", new Nominee());
        return "addNominee"; // This should match the HTML file name
    }

//    @PostMapping("/nominees/add")
//    public String addNominee(Nominee nominee) {
//        nomineeService.saveNominee(nominee);
//        return "redirect:/nominees"; // Redirect to the list of nominees after adding
//    }
    
    @PostMapping("/nominees/add")
    public String saveVoter(@ModelAttribute Nominee nominee) {
    	nomineeService.saveNominee(nominee);
        return "redirect:/adminDashboard";
    }

    @GetMapping("/nominees/delete/{id}")
    public String deleteNominee(@PathVariable int id) {
        nomineeService.deleteNominee(id);
        return "redirect:/nominees";
    }
}