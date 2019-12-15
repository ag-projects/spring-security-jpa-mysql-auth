package com.agharibi.springsecurityjpamysqlauth;

import com.agharibi.springsecurityjpamysqlauth.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringSecurityJpaMysqlAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityJpaMysqlAuthApplication.class, args);
    }

}
