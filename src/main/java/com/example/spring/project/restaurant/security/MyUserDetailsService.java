//package com.example.spring.project.restaurant.security;
//
//import com.example.spring.project.restaurant.model.User;
//import com.example.spring.project.restaurant.repository.UserRepository;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//import java.util.List;
//
//public class MyUserDetailsService implements UserDetailsService {
//
//    UserRepository userRepository;
//
//    public MyUserDetailsService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//        User user = userRepository.findUserByEmail(email).orElseThrow(() ->
//                new UsernameNotFoundException("User with this email does not exist"));
//        List<SimpleGrantedAuthority> authorities = null; // <- TO DO
//        return new org.springframework.security.core.userdetails.User(
//                user.getEmail(),
//                user.getPassword(),
//                authorities
//        );
//    }
//}
