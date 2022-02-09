package com.userEldarService.UserEldarService.servicies;

import com.userEldarService.UserEldarService.dtos.UserDTO;
import com.userEldarService.UserEldarService.entities.User;
import com.userEldarService.UserEldarService.repositories.UserRepository;
import com.userEldarService.UserEldarService.util.UserEntityDtoConverter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserEntityDtoConverter userConverter;

    @Override
    public User save(UserDTO u) {
        return userRepository.save(userConverter.convertUserDtoToEntity(u));
    }

    @Override
    public User findById(Long id) throws Exception {
        return userRepository.findById(id).orElseThrow( () -> new Exception("No existe el usuario con id "+ id));
    }

    @Override
    public boolean existeUsuarioByCardHolder(String cardHolder) {
        User u = userRepository.findByCardholder(cardHolder);
        if (u != null){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
