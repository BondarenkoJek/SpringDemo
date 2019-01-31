package ua.bondarenkojek.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.bondarenkojek.dto.DeveloperDto;
import ua.bondarenkojek.model.Developer;
import ua.bondarenkojek.repository.DeveloperRepository;
import ua.bondarenkojek.service.DeveloperService;
import ua.bondarenkojek.util.DtoUtil;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DeveloperServiceImpl implements DeveloperService {

    @Autowired
    private DeveloperRepository developerRepository;

    @Override
    public Developer add(Developer developer) {
        return developerRepository.save(developer);
    }

    @Override
    public DeveloperDto get(Long id) {
        return DtoUtil.parseDeveloperToDto(developerRepository.findById(id).get());
    }

    @Override
    public List<Developer> findAll() {
        return developerRepository.findAll();

    }

    @Override
    public void delete(Long id) {
        developerRepository.deleteById(id);
    }

    @Override
    public void update(Developer developer) {
        developerRepository.save(developer);
    }

    @Override
    public List<Developer> getDevelopersWithSalaryMoreThen(Double salary) {
        return developerRepository.findAllBySalaryGreaterThan(salary);
    }
}
