package ua.bondarenkojek.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import ua.bondarenkojek.model.Company;
import ua.bondarenkojek.repository.CompanyRepository;
import ua.bondarenkojek.service.CompanyService;

import java.util.List;

public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public void add(Company company) {
        companyRepository.save(company);
    }

    @Override
    public Company get(Long id) {
        return companyRepository.getOne(id);
    }

    @Override
    public void update(Company company) {
        companyRepository.save(company);
    }

    @Override
    public void delete(Company company) {
        companyRepository.delete(company);
    }

    @Override
    public List<Company> findAll() {
        return companyRepository.findAll();
    }
}
