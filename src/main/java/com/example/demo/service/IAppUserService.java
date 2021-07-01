package com.example.demo.service;

import com.example.demo.model.AppUser;

import java.util.Optional;

public interface IAppUserService extends IGeneralService<AppUser> {
    Optional<AppUser> findAppUserByName(String name);
    Boolean existsAppUserByEmail(String email);
    Boolean existsAppUserByName(String name);
}
