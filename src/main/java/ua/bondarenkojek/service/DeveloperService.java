package ua.bondarenkojek.service;

import ua.bondarenkojek.dto.DeveloperDto;
import ua.bondarenkojek.model.Developer;

import java.util.List;

public interface DeveloperService {
    DeveloperDto add(Developer developer);

    DeveloperDto get(Long id);

    List<DeveloperDto> findAll();

    void delete(Long id);

    void update(Developer developer);

    List<DeveloperDto> getDevelopersWithSalaryMoreThen(Double salary);
}
