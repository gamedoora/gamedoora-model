package com.gamedoora.model.dto.dto.reviewDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class TenantUserDTO {

    private long id;

    private String role;
}