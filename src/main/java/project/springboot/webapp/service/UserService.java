package project.springboot.webapp.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import project.springboot.webapp.dto.UserRegistrationDto;
import project.springboot.webapp.model.User;

public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
}
