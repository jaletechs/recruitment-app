package com.jaletechs.recruiterapp.recruiter_app.controllers;

import com.jaletechs.recruiterapp.recruiter_app.controllers.util.EntityMapper;
import com.jaletechs.recruiterapp.recruiter_app.dtos.RoleDto;
import com.jaletechs.recruiterapp.recruiter_app.entities.Role;
import com.jaletechs.recruiterapp.recruiter_app.entities.UserRole;
import com.jaletechs.recruiterapp.recruiter_app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jaletechs on 2019-06-15.
 */
@RestController
@RequestMapping("/roles")
public class RoleRestController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/search")
    public List<RoleDto> getUserRoles(@RequestParam("email") String email) {
        List<UserRole> userRoles = userRepository.getOne(email).getUserRoleList();
        return EntityMapper.mapToRoleDtos(getRoles(userRoles));
    }


    private List<Role> getRoles(List<UserRole> userRoles) {
        List<Role> roles = new ArrayList<>();
        userRoles.forEach(userRole -> roles.add(userRole.getRole()));
        return roles;
    }
} 
