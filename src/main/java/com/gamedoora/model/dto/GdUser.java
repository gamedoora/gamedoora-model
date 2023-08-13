package com.gamedoora.model.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class GdUser {
    private List<RoleDTO> roles;
    private List<SkillsDTO> skills;
    private UserDTO user;
}
