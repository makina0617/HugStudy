package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ListEntity;

@Repository
public interface ListRepository extends JpaRepository<ListEntity, Integer>{
}
