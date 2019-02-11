package ua.bondarenkojek.service.impl;

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
public class DeveloperServiceImpl implements DeveloperService {

    @Autowired
    private DeveloperRepository developerRepository;

    @Transactional
    @Override
    public DeveloperDto add(Developer developer) {
        Developer result = developerRepository.save(developer);
        return DtoUtil.parseDeveloperToDto(result);
    }

    @Override
    public DeveloperDto get(Long id) {
        Developer developer = developerRepository.getOne(id);
        return DtoUtil.parseDeveloperToDto(developer);
    }

    @Override
    public List<DeveloperDto> findAll() {
        List<DeveloperDto> developers = developerRepository
                .findAll()
                .stream()
                .map(DtoUtil::parseDeveloperToDto)
                .collect(Collectors.toList());
        return developers;
    }

    @Transactional
    @Override
    public void delete(Long id) {
            developerRepository.deleteById(id);
    }

    @Override
    public void update(Developer developer) {
        developerRepository.save(developer);
    }

    @Override
    public List<DeveloperDto> getDevelopersWithSalaryMoreThen(Double salary) {
        List<DeveloperDto> developers = developerRepository
                .findAllBySalaryGreaterThan(salary)
                .stream()
                .map(DtoUtil::parseDeveloperToDto)
                .collect(Collectors.toList());
        return developers;
    }
}
