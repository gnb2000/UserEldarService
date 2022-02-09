package com.userEldarService.UserEldarService.controllers;

import com.userEldarService.UserEldarService.dtos.UserDTO;
import com.userEldarService.UserEldarService.entities.User;
import com.userEldarService.UserEldarService.servicies.UserService;
import com.userEldarService.UserEldarService.util.UserEntityDtoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserEntityDtoConverter userConverter;

    @PostMapping
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO user){
        User u = userService.save(user);
        return new ResponseEntity<>(userConverter.convertUserEntityToDto(u), HttpStatus.CREATED);
    }

    @GetMapping("/{cardHolder}")
    public boolean existeUsuario(@PathVariable String cardHolder){
        return userService.existeUsuarioByCardHolder(cardHolder);
    }


}
