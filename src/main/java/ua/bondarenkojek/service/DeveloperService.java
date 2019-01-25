package ua.bondarenkojek.service;

import ua.bondarenkojek.model.Developer;

import java.util.List;

public interface DeveloperService {
    Developer add(Developer developer);

    Developer get(Long id);

    List<Developer> findAll();

    void delete(Developer developer);

    void update(Developer developer);

    List<Developer> getDevelopersWithSalaryMoreThen(Double salary);
}
