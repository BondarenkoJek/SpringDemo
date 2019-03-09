package ua.bondarenkojek.service;

import ua.bondarenkojek.dto.ProjectDto;
import ua.bondarenkojek.model.Developer;
import ua.bondarenkojek.model.Project;

import java.util.List;

public interface ProjectService {
    void add(Project project);

    void addDeveloperForProject(Project project, Developer developer);

    Project get(Long id);

    void update(Project project);

    void delete(Long id);

    void removeDeveloperFromProject(Project project, Developer developer);

    List<ProjectDto> findAll();

    Double getAllSalaryByProject(Project project);
}
