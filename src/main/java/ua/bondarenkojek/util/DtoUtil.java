package ua.bondarenkojek.util;

import ua.bondarenkojek.dto.DeveloperDto;
import ua.bondarenkojek.model.Developer;

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
}
