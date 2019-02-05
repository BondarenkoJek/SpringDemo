package ua.bondarenkojek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.bondarenkojek.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
