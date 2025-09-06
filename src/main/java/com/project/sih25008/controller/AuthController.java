package com.project.sih25008.controller;

import com.project.sih25008.dto.AuthRequest;
import com.project.sih25008.dto.AuthResponse;
import com.project.sih25008.model.User;
import com.project.sih25008.service.AuthService;
import com.project.sih25008.service.UserService;
import com.project.sih25008.security.JwtUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthenticationManager authenticationManager;
    private final JwtUtils jwtUtils;
    private final AuthService authService;
    @PostMapping("/register")
    public User register(@RequestBody AuthRequest request) {
        // call authService.register so password is encoded there
        return authService.register(request.getUsername(), request.getUsername()+"@mail.com", request.getPassword());
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest request) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword())
        );
        String token = jwtUtils.generateToken(authentication.getName());
        return new AuthResponse(token);
    }
}
