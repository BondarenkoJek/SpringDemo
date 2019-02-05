package ua.bondarenkojek.util;

import ua.bondarenkojek.dto.DeveloperDto;
import ua.bondarenkojek.dto.UserDto;
import ua.bondarenkojek.model.Developer;
import ua.bondarenkojek.model.User;

public class DtoUtil {
    public static DeveloperDto parseDeveloperToDto(Developer developer) {
        return DeveloperDto
                .builder()
                .id(developer.getId())
                .name(developer.getName())
                .age(developer.getAge())
                .salary(developer.getSalary())
                .build();
    }

    public static Developer parseDtoToDeveloper(DeveloperDto developerDto) {
        return Developer
                .builder()
                .name(developerDto.getName())
                .age(developerDto.getAge())
                .salary(developerDto.getSalary())
                .build();
    }

    public static UserDto parseUserToDto(User user) {
        return UserDto
                .builder()
                .id(user.getId())
                .login(user.getLogin())
                .password(user.getPassword())
                .build();
    }

    public static User parseDtoToUser(UserDto userDto) {
        return User
                .builder()
                .id(userDto.getId())
                .login(userDto.getLogin())
                .password(userDto.getPassword())
                .build();
    }
}
