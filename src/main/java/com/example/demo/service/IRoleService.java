package com.example.demo.service;

import com.example.demo.model.Role;

import java.util.Optional;

public interface IRoleService extends IGeneralService<Role>{
    Optional<Role> findRoleByName(String name);
}
