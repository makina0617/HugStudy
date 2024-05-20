package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.TestEntity;
import com.example.demo.repository.TestRepository;

/**
 * ユーザー情報 Service
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TestService {
  /**
   * ユーザー情報 Repository
   */
  @Autowired
  private TestRepository testRepository;


  /**
   * ユーザー情報 全検索
   * @return 検索結果
   */
  public List<TestEntity> searchAll() {
    return testRepository.findAll();
  }
}