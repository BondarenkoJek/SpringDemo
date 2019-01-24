package ua.bondarenkojek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.bondarenkojek.model.Developer;

import java.util.List;

@Repository
public interface DeveloperRepository extends JpaRepository<Developer, Long> {
    List<Developer> findAllBySalaryGreaterThan(Double salary);
}
