package com.gamedoora.model.dto;

import lombok.*;

import java.util.List;


@EqualsAndHashCode(callSuper = false)
@Builder
public class GdUser {
    private List<RoleDTO> roles;
    private List<SkillsDTO> skills;
    private UserDTO user;
}
