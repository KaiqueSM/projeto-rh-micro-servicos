package com.devsuperior.hroauth.entities;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class Role implements Serializable {

    private Long id;

    private String roleName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return roleName.equals(role.roleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleName);
    }
}
