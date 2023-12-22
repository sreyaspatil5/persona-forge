package com.smart.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.smart.models.Admin;
import com.smart.models.User;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
}

