package com.userEldarService.UserEldarService.repositories;

import com.userEldarService.UserEldarService.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByCardholder(String cardHolder);
}
