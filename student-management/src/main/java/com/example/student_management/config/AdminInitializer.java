package com.example.student_management.config;

import com.example.student_management.model.Admin;
import com.example.student_management.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AdminInitializer implements CommandLineRunner {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public void run(String... args) throws Exception {
        if (adminRepository.findByUsername("admin") == null) {
            Admin admin = new Admin();
            admin.setUsername("admin");
            admin.setPassword("admin123");
            adminRepository.save(admin);
            System.out.println("Default admin created: username=admin, password=admin123");

                    }
    }
}
