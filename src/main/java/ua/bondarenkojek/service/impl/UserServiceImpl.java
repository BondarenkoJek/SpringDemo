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
    public UserDto add(UserRegistrationInput userRegistrationInput) {
        User user = UserRegistrationInput.ofUser(userRegistrationInput);
        user = userRepository.save(user);
        return DtoUtil.parseUserToDto(user);
    }

    @Transactional(readOnly = true)
    @Override
    public UserDto get(Long id) {
        User user = userRepository.getOne(id);
        return DtoUtil.parseUserToDto(user);
    }

    @Override
    public void update(UserDto userDto) {
        User user = DtoUtil.parseDtoToUser(userDto);
        userRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserDto geUserByLogin(String login) {
        User user = userRepository.getUserByLogin(login);
        return DtoUtil.parseUserToDto(user);
    }
}
