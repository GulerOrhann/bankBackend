package com.example.bankBackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.bankBackend.Entity.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long>{

}
