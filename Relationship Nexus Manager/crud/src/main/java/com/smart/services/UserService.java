package com.smart.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.models.User;
import com.smart.repositories.UserRepository;

@Service
public class UserService {
	
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        return optionalUser.orElse(null);
    }

    public User createUser(User user) {
        // Perform validation checks if required
        return userRepository.save(user);
    }

    public User updateUser(Long id, User user) {
        Optional<User> existingUserOptional = userRepository.findById(id);
        if (existingUserOptional.isPresent()) {
        	User existingUser = existingUserOptional.get();
        	
        	User updatedUser = new User();
        	existingUser.setId(user.getId());
        	existingUser.setUsername(user.getUsername());
        	existingUser.setAddress(user.getAddress());
            existingUser.setEmail(user.getEmail());
            existingUser.setContactNo(user.getContactNo());
            existingUser.setImage(user.getImage());
        	
            user.setId(id);
            return userRepository.save(existingUser);
        }
        return null; // Or throw an exception for user not found
    }

    public String deleteUser(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            userRepository.deleteById(id);
            return "User deleted successfully";
        }
        return "User not found";
    }
}
