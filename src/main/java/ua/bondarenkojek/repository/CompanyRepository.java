package ua.bondarenkojek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.bondarenkojek.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
