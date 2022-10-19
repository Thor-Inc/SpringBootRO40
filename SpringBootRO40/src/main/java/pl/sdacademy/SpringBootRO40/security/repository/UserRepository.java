package pl.sdacademy.SpringBootRO40.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sdacademy.SpringBootRO40.security.model.User;

public interface UserRepository extends JpaRepository<User, String> {
}