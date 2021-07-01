package com.example.demo.repository;

import com.example.demo.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface IUserRepository extends JpaRepository<AppUser,Long> {
    Optional<AppUser> findAppUserByName(String name);
    Boolean existsAppUserByEmail(String email);
    Boolean existsAppUserByName(String name);

}
