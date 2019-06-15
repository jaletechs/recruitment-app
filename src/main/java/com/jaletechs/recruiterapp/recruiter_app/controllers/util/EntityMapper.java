package com.jaletechs.recruiterapp.recruiter_app.controllers.util;

import com.jaletechs.recruiterapp.recruiter_app.dtos.RoleDto;
import com.jaletechs.recruiterapp.recruiter_app.entities.Role;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jaletechs on 2019-06-15.
 */
public class EntityMapper {
    public static RoleDto mapToRoleDto(Role role) {
        if (role == null) return null;

        RoleDto dto = new RoleDto();

        dto.setId(role.getId());
        dto.setName(role.getName());

        return dto;
    }

    public static List<RoleDto> mapToRoleDtos(List<Role> roles) {
        List<RoleDto> dtos = new ArrayList<>();
        roles.forEach(role -> dtos.add(mapToRoleDto(role)));
        return dtos;
    }
} 
