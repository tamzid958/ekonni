package com.dsi.backend.repository;

import com.dsi.backend.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {

    AppUser findByEmail(String email);
}
