package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UpdateEntity;

@Repository
public interface UpdateRepository extends JpaRepository<UpdateEntity, Integer>{
}
