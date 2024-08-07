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
import com.example.demo.repository.VoterRepository;
import com.example.demo.service.NomineeService;
import com.example.demo.service.VoterService;

@Controller
public class VoterController {
    @Autowired
    private VoterService voterService;
    
    @Autowired
    private VoterRepository voterrepo;
    
    @Autowired
    private NomineeService nomineeService;

    @GetMapping("/adminDashboard")
    public String showAdminDashboard(Model model) {
        model.addAttribute("voters", voterService.voterlist());
        model.addAttribute("nominees", nomineeService.getAllNominees());
        return "adminDashboard";
    }

    @GetMapping("/voters/edit/{id}")
    public String editVoter(@PathVariable int id, Model model) {
        Voter voter = voterService.findById(id);
        model.addAttribute("voter", voter);
        return "voterEdit";
    }

    @PostMapping("/voters/update")
    public String updateVoter(@ModelAttribute Voter voter) {
        voterService.updateVoter(voter, voter.getId());
        return "redirect:/adminDashboard";
    }

    @GetMapping("/voters/delete/{id}")
    public String deleteVoter(@PathVariable("id") int id) {
        voterService.deleteById(id);
        return "redirect:/adminDashboard";
    }

    @GetMapping("/voters/add")
    public String addVoter(Model model) {
        model.addAttribute("voter", new Voter());
        return "voterAdd";
    }

    @PostMapping("/voters/save")
    public String saveVoter(@ModelAttribute Voter voter) {
        voterService.saveVoter(voter);
        return "redirect:/adminDashboard";
    }
    
    @GetMapping("/voterlogin")
    public String showVoterLoginForm(Model model) {
        model.addAttribute("voterlogin", new Voter());
        return "voterlogin"; // This will render voterlogin.html
    }

    @PostMapping("/validateVoterLogin")
    public String validateVoterLogin(@ModelAttribute Voter voterLogin, Model model) {
        Voter voter = null;
        try {
            voter = voterrepo.findByUsernameAndPassword(voterLogin.getUsername(), voterLogin.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println(voterLogin.getUsername());
        System.out.println(voterLogin.getPassword());
        System.out.println(voter);

        if (voter != null) {
            // Add voter and nominees to model
            model.addAttribute("voter", voter);
            List<Nominee> nominees = nomineeService.getAllNominees();
            model.addAttribute("nominees", nominees);

            return "voterDashboard"; // This will look for voterDashboard.html
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "voterlogin"; // This will look for voterlogin.html
        }
    }
    
    
    
    
    
    
    
    
    
    
    
}
