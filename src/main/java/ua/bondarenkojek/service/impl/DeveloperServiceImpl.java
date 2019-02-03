package ua.bondarenkojek.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.bondarenkojek.model.Developer;
import ua.bondarenkojek.repository.DeveloperRepository;
import ua.bondarenkojek.service.DeveloperService;

import java.util.List;

@Service
public class DeveloperServiceImpl implements DeveloperService {

    private static  final Logger logger = LoggerFactory.getLogger(DeveloperServiceImpl.class);

    @Autowired
    private DeveloperRepository developerRepository;

    @Override
    public Developer add(Developer developer) {
        Developer result = developerRepository.save(developer);
        logger.info("Developer successfully added!");
        return result;
    }

    @Override
    public Developer get(Long id) {
        Developer developer = developerRepository.findById(id).get();
        logger.info("Developer successfully got!");
        return developer;
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
