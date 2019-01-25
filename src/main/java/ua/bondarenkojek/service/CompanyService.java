package ua.bondarenkojek.service;

import ua.bondarenkojek.model.Company;

import java.util.List;

public interface CompanyService {
    void add(Company company);

    Company get(Long id);

    void update(Company company);

    void delete(Company id);

    List<Company> findAll();
}
