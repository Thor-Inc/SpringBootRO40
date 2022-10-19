package pl.sdacademy.SpringBootRO40.security.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.sdacademy.SpringBootRO40.security.UserDetailsAdapter;
import pl.sdacademy.SpringBootRO40.security.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
        return userRepository.findById(username)
                .map(UserDetailsAdapter::new)
                .orElse(null);
    }
}