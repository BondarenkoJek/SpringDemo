package ua.bondarenkojek.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import ua.bondarenkojek.model.Developer;
import ua.bondarenkojek.model.Project;
import ua.bondarenkojek.repository.ProjectRepository;
import ua.bondarenkojek.service.ProjectService;

import java.util.List;

public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public void add(Project project) {
        projectRepository.save(project);
    }

    @Override
    public void addDeveloperForProject(Project project, Developer developer) {

    }

    @Override
    public Project get(Long id) {
        return projectRepository.getOne(id);
    }

    @Override
    public void update(Project project) {
        projectRepository.save(project);

    }

    @Override
    public void delete(Project project) {
        projectRepository.delete(project);
    }

    @Override
    public void removeDeveloperFromProject(Project project, Developer developer) {

    }

    @Override
    public List<Project> findAll() {
        return projectRepository.findAll();
    }

    @Override
    public Double getAllSalaryByProject(Project project) {
        return null;
    }
}
