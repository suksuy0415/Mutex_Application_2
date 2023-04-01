package org.example.repository;


import org.example.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepository extends JpaRepository<User,String> {
}
