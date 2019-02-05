package ua.bondarenkojek.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.bondarenkojek.dto.UserDto;
import ua.bondarenkojek.dto.UserRegistrationInput;
import ua.bondarenkojek.model.User;
import ua.bondarenkojek.repository.UserRepository;
import ua.bondarenkojek.service.UserService;
import ua.bondarenkojek.util.DtoUtil;

@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDto add(UserRegistrationInput user) {
        User resultUser = UserRegistrationInput.ofUser(user);
        resultUser = userRepository.save(resultUser);
        return DtoUtil.parseUserToDto(resultUser);
    }

    @Transactional(readOnly = true)
    @Override
    public UserDto get(Long id) {
        return null;
    }

    @Override
    public void update(UserDto user) {

    }

    @Override
    public void delete(Long id) {

    }
}
