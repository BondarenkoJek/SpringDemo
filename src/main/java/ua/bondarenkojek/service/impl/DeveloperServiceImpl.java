package ua.bondarenkojek.service.impl;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.bondarenkojek.dto.DeveloperDto;
import ua.bondarenkojek.model.Developer;
import ua.bondarenkojek.repository.DeveloperRepository;
import ua.bondarenkojek.service.DeveloperService;
import ua.bondarenkojek.util.DtoUtil;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
@Log4j2
public class DeveloperServiceImpl implements DeveloperService {

    private static final Logger logger = LogManager.getLogger(DeveloperServiceImpl.class);

    @Autowired
    private DeveloperRepository developerRepository;

    @Transactional
    @Override
    public Developer add(Developer developer) {
        Developer result = developerRepository.save(developer);
        logger.info("Developer successfully saved. Developer details: " + result);
        return result;
    }

    @Override
    public DeveloperDto get(Long id) {
        Developer developer = developerRepository.getOne(id);
        logger.info("Developer successfully loaded. Developer details: " + developer);

        return DtoUtil.parseDeveloperToDto(developer);
    }

    @Override
    public List<DeveloperDto> findAll() {
        List<DeveloperDto> developers = developerRepository
                .findAll()
                .stream()
                .map(DtoUtil::parseDeveloperToDto)
                .collect(Collectors.toList());

        developers.forEach(d -> logger
                .info("Developer successfully loaded. Developer details: " + d));
        return developers;
    }

    @Transactional
    @Override
    public void delete(Long id) {
        Developer developer = developerRepository.getOne(id);

        if (developer != null) {
            developerRepository.deleteById(id);
            logger.info("Developer successfully deleted. Developer details: " + developer);
        }
    }

    @Override
    public void update(Developer developer) {
        developerRepository.save(developer);
        logger.info("Developer successfully updated. Developer details: " + developer);
    }

    @Override
    public List<DeveloperDto> getDevelopersWithSalaryMoreThen(Double salary) {
        List<DeveloperDto> developers = developerRepository
                .findAllBySalaryGreaterThan(salary)
                .stream()
                .map(DtoUtil::parseDeveloperToDto)
                .collect(Collectors.toList());;

        developers.forEach(d -> logger
                .info("Developer successfully loaded. Developer details: " + d));
        return developers;
    }
}
