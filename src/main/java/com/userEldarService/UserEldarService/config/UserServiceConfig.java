package com.userEldarService.UserEldarService.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserServiceConfig {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
