package com.youjiuye.springdemo2.dao;

import com.youjiuye.springdemo2.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends  JpaRepository<User, Long>{
}
