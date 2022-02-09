package com.userEldarService.UserEldarService.util;

import com.userEldarService.UserEldarService.dtos.UserDTO;
import com.userEldarService.UserEldarService.entities.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserEntityDtoConverter {

    @Autowired
    private ModelMapper modelMapper;

    public UserDTO convertUserEntityToDto(User u){
        return modelMapper.map(u,UserDTO.class);
    }

    public User convertUserDtoToEntity(UserDTO u){ return modelMapper.map(u, User.class);}

    public List<UserDTO> convertUsersEntityToDto(List<User> users){
        return users.stream()
                .map(user -> this.convertUserEntityToDto(user))
                .collect(Collectors.toList());
    }
}
