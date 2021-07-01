package com.example.demo.service.iplm;

import com.example.demo.model.Role;
import com.example.demo.repository.IRoleRepository;
import com.example.demo.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleService implements IRoleService {

    @Autowired
    IRoleRepository repository;

    @Override
    public Iterable<Role> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Role> getById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Role save(Role role) {
        return repository.save(role);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<Role> findRoleByName(String name) {
        return repository.findRoleByName(name);
    }
}
