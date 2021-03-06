package ua.bondarenkojek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.bondarenkojek.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

}
