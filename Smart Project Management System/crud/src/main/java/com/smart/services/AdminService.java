package com.smart.services;


import com.smart.models.Admin;
import com.smart.repositories.AdminRepository;
import java.util.List;
import java.util.Optional;

import org.hibernate.mapping.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
 @Autowired
 private AdminRepository adminRepository;

 public List<Admin> getAllAdmins() {
     return adminRepository.findAll();
 }

 public Admin getAdminById(Long id) {
     return adminRepository.findById(id).orElse(null);
 }

 public Admin createAdmin(Admin admin) {
     return adminRepository.save(admin);
 }

 public Admin updateAdmin(Long id, Admin admin) {
	 Optional<Admin> adminOptional = adminRepository.findById(id);
     if (adminOptional.isPresent()) {
    	 Admin existingAdmin = adminOptional.get();
    	 
         if(admin.getUsername() !=null && !admin.getUsername().isEmpty()) {
        	 existingAdmin.setUsername(admin.getUsername());
         }
         
         if(admin.getEmail() !=null && !admin.getEmail().isEmpty()) {
        	 existingAdmin.setEmail(admin.getEmail());
         }
         
         if(admin.getPassword() !=null && !admin.getPassword().isEmpty()) {
        	 existingAdmin.setPassword(admin.getPassword());
         }
         
         return adminRepository.save(existingAdmin);
     }
     return null;
 }

 public String deleteAdmin(Long id) {
     if (adminRepository.existsById(id)) {
         adminRepository.deleteById(id);
         return "Admin deleted successfully";
     }
     return "Admin not found";
 }
}


