package ua.bondarenkojek.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.bondarenkojek.model.Developer;
import ua.bondarenkojek.repository.DeveloperRepository;
import ua.bondarenkojek.service.DeveloperService;

import java.util.List;

@Service
public class DeveloperServiceImpl implements DeveloperService {

    @Autowired
    private DeveloperRepository developerRepository;

    @Override
    public Developer add(Developer developer) {
        return developerRepository.save(developer);
    }

    @Override
    public Developer get(Long id) {
        return developerRepository.getOne(id);
    }

    @Override
    public List<Developer> findAll() {
        return developerRepository.findAll();
    }

    @Override
    public void delete(Developer developer) {
        developerRepository.delete(developer);
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
