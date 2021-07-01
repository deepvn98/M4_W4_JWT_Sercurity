package com.example.demo.service.iplm;

import com.example.demo.model.AppUser;
import com.example.demo.repository.IUserRepository;
import com.example.demo.service.IAppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AppUserService implements IAppUserService {
    @Autowired
    IUserRepository  repository;
    @Override
    public Optional<AppUser> findAppUserByName(String name) {
        return repository.findAppUserByName(name);
    }

    @Override
    public Boolean existsAppUserByEmail(String email) {
        return repository.existsAppUserByEmail(email);
    }

    @Override
    public Boolean existsAppUserByName(String name) {
        return repository.existsAppUserByName(name);
    }

    @Override
    public Iterable<AppUser> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<AppUser> getById(Long id) {
        return repository.findById(id);
    }

    @Override
    public AppUser save(AppUser appUser) {
        return repository.save(appUser);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
