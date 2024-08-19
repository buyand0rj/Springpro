package com.Springdemo.Springdemo.repository;

import com.Springdemo.Springdemo.model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
}
