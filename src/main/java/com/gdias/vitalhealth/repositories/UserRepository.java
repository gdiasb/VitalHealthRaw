package com.gdias.vitalhealth.repositories;

import com.gdias.vitalhealth.domain.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

// Classe responsável pelo processo de autenticação
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserDetails findByUserLogin(String userLogin);
}
