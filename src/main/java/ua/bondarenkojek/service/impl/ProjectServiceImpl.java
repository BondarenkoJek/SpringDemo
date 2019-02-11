package ua.bondarenkojek.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.bondarenkojek.dto.ProjectDto;
import ua.bondarenkojek.model.Developer;
import ua.bondarenkojek.model.Project;
import ua.bondarenkojek.repository.ProjectRepository;
import ua.bondarenkojek.service.ProjectService;
import ua.bondarenkojek.util.DtoUtil;

import java.util.List;
import java.util.stream.Collectors;

@Service
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
    public void delete(Long id) {
        projectRepository.deleteById(id);
    }

    @Override
    public void removeDeveloperFromProject(Project project, Developer developer) {

    }

    @Override
    public List<ProjectDto> findAll() {
        return projectRepository
                .findAll()
                .stream()
                .map(DtoUtil::parseProjectToDto)
                .collect(Collectors.toList());
    }

    @Override
    public Double getAllSalaryByProject(Project project) {
        return null;
    }
}
