package com.shital.ecommerce.userservice.services;

import org.springframework.stereotype.Service;

@Service
public class AuthService {
/*

    private final ApplicationUserRepository userRepository;
    private final JwtTokenProvider jwtTokenProvider;
    private final PasswordEncoder passwordEncoder;

    public AuthService(ApplicationUserRepository userRepository, JwtTokenProvider jwtTokenProvider, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.jwtTokenProvider = jwtTokenProvider;
        this.passwordEncoder = passwordEncoder;
    }

    public void signUp(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    public String login(User user) {
        User existingUser = userRepository.findByEmail(user.getEmail())
                .orElseThrow(() -> new RuntimeException("User not found with email: " + user.getEmail()));

        if (passwordEncoder.matches(user.getPassword(), existingUser.getPassword())) {
            return jwtTokenProvider.generateToken(user.getEmail());
        } else {
            throw new RuntimeException("Login failed. Invalid credentials.");
        }
    }

    public void logout(String token) {
        // Perform logout logic (if needed)
        // For simplicity, let's assume the client will handle token invalidation on the frontend
    }
*/
}
