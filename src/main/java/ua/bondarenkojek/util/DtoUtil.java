package ua.bondarenkojek.util;

import ua.bondarenkojek.dto.DeveloperDto;
import ua.bondarenkojek.dto.ProjectDto;
import ua.bondarenkojek.dto.UserDto;
import ua.bondarenkojek.model.Developer;
import ua.bondarenkojek.model.Project;
import ua.bondarenkojek.model.user.User;

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

    public static Project parseDtoToProjrct(ProjectDto projectDto) {
        return Project
                .builder()
                .build();
    }

    public static ProjectDto parseProjectToDto(Project project) {
        return ProjectDto
                .builder()
                .build();
    }
}
