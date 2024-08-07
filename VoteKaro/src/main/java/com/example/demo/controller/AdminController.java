package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Admin;
import com.example.demo.entity.AdminLogin;
import com.example.demo.entity.Nominee;
import com.example.demo.entity.Voter;
import com.example.demo.repository.VoterRepository;
import com.example.demo.service.AdminService;
import com.example.demo.service.NomineeService;
import com.example.demo.service.VoterService;

import jakarta.validation.Valid;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;
   
    @Autowired
    private VoterService voterservice;
    
    @Autowired
    private VoterRepository voterrepo;
    
    @Autowired
    private NomineeService nomineeService;

    
//    @Autowired
//    private Voter voter ;
//    

    @GetMapping("/home")
    public String showHomePage() {
        return "home"; // This will render home.html
    }

    @GetMapping("/saveAdmin")
    public String showRegistrationForm(Model model) {
        model.addAttribute("admin", new Admin());
        return "adminregister";
    }

    @PostMapping("/goadminregister")
    public String registerAdmin(@Valid @ModelAttribute Admin admin, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "adminregister";
        }
        adminService.saveAdmin(admin);
        return "redirect:/adminlogin"; // Ensure this path matches your configuration
    }

    @GetMapping("/adminlogin")
    public String showLoginForm(Model model) {
        model.addAttribute("adminlogin", new AdminLogin());
        return "adminlogin";
    }

    @PostMapping("/validateAdminLogin")
    public String validateAdminLogin(@ModelAttribute AdminLogin adminLogin, Model model) {
        Admin admin = adminService.findByUsernameAndPassword(adminLogin.getUsername(), adminLogin.getPassword());
        
        if (admin != null) {
            model.addAttribute("admin", admin);
            
            // Retrieve the list of voters and nominees
            List<Voter> voters = voterservice.voterlist(); // Ensure this method is correct and returns the list of voters
            model.addAttribute("voters", voters); // Corrected name to match Thymeleaf template
            
            List<Nominee> nominees = nomineeService.getAllNominees(); // Ensure this method is correct
            model.addAttribute("nominees", nominees);
            
            return "adminDashboard"; // This will look for adminDashboard.html
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "adminlogin";
        }
    }
    
    @GetMapping("/logout")
    public String logout(Model model) {
        //model.addAttribute("adminlogin", new AdminLogin());
        return "home";
    }
    
//    @GetMapping("/voterlogin")
//    public String showVoterLoginForm(Model model) {
//        model.addAttribute("voterlogin", new Voter());
//        return "voterlogin"; // This will render voterlogin.html
//    }
//
//    @PostMapping("/validateVoterLogin")
//    public String validateVoterLogin(@ModelAttribute Voter voterLogin, Model model) {
//        Voter voter = null;
//        try {
//            voter = voterrepo.findByUsernameAndPassword(voterLogin.getUsername(), voterLogin.getPassword());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        
//        System.out.println(voterLogin.getUsername());
//        System.out.println(voterLogin.getPassword());
//        System.out.println(voter);
//
//        if (voter != null) {
//            model.addAttribute("voter", voter);
//            return "voterDashboard"; // This will look for voterDashboard.html
//        } else {
//            model.addAttribute("error", "Invalid username or password");
//            return "voterlogin"; // This will look for voterlogin.html
//        }
//    }
//    @GetMapping("/voterlogin")
//    public String voterLogin(Model model) {
//        model.addAttribute("voterlogin", new Voter());
//        return "adminlogin";
//    }
//    
    
    //     voter Controller    
    

}
