package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users",uniqueConstraints = {
        @UniqueConstraint(columnNames ={
                "username"
        }),
        @UniqueConstraint(columnNames = {
                "email"
        })
})
public class AppUser {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @NotBlank
        private String name;
        @NotBlank
        @Size(min = 3,max = 50)
        private String username;
        @NotBlank
        @Size(min = 3,max = 50)
        private String email;
        @NotBlank
        @JsonIgnore
        @Size(min = 3,max = 50)
        private String password;
        @ManyToMany(fetch = FetchType.EAGER)
        @JoinTable(name = "users_roles",
                joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "role_id"))
        private Set<Role> roles = new HashSet<>();

        public AppUser() {
        }

        public AppUser(Long id, @NotBlank String name, @NotBlank @Size(min = 3, max = 50) String userName, @NotBlank @Size(min = 3, max = 50) String email, @NotBlank @Size(min = 3, max = 50) String password, Set<Role> roles) {
                this.id = id;
                this.name = name;
                this.username = userName;
                this.email = email;
                this.password = password;
                this.roles = roles;
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getUserName() {
                return username;
        }

        public void setUserName(String username) {
                this.username = username;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        public Set<Role> getRoles() {
                return roles;
        }

        public void setRoles(Set<Role> roles) {
                this.roles = roles;
        }

}
