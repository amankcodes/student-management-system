package com.example.student_management.controller;

import com.example.student_management.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    // Show login page
    @GetMapping("/admin/login")
    public String showLoginPage() {
        return "login"; // templates/login.html
    }

    // Handle login form
    @PostMapping("/admin/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        Model model) {
        if (adminService.validateAdmin(username, password)) {
            return "redirect:/students"; // Redirect to main page
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }
    }

    // Logout
    @GetMapping("/admin/logout")
    public String logout() {
        return "redirect:/admin/login";
    }
}
