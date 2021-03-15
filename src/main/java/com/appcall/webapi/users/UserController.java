package com.appcall.webapi.users;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    /*@RequestMapping("/customers")
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }*/

    /*@Transactional(rollbackFor = Exception.class)
    public String saveDto(UserDto userDto) {
        userDto.setPassword(bCryptPasswordEncoder.encode(userDto.getPassword()));
        return save(new User(userDto)).getId();
    }*/
}