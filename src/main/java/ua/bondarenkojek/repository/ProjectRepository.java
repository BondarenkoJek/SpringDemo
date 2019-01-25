package ua.bondarenkojek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.bondarenkojek.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}
