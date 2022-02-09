package com.userEldarService.UserEldarService.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class UserDTO {

    private Long id;
    private String cardHolder;
    private String address;
    private String phone;
}
