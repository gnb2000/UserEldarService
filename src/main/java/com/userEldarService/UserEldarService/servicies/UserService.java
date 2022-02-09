package com.userEldarService.UserEldarService.servicies;

import com.userEldarService.UserEldarService.dtos.UserDTO;
import com.userEldarService.UserEldarService.entities.User;

import java.util.List;

public interface UserService {

    User save(UserDTO u);
    User findById(Long id) throws Exception;
    boolean existeUsuarioByCardHolder(String cardHolder);
    List<User> findAll();

}
