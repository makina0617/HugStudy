package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CreateEntity;

@Repository
public interface CreateRepository extends JpaRepository<CreateEntity, Integer>{
}
