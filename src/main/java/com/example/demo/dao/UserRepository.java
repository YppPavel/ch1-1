package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * created by liubao on 2018/5/10
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
