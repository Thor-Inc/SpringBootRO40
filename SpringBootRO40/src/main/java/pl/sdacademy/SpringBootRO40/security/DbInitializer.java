package pl.sdacademy.SpringBootRO40.security;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import pl.sdacademy.SpringBootRO40.security.model.User;
import pl.sdacademy.SpringBootRO40.security.repository.UserRepository;

@Component
public class DbInitializer implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public DbInitializer(final UserRepository userRepository, final PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(final String... args) throws Exception {
        userRepository.save(new User("user1", passwordEncoder.encode("Admin_1"), "ADMIN"));
    }
}