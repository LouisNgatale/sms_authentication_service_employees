package io.ngatale.employee_authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class EmployeeAuthenticationApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeAuthenticationApplication.class, args);
    }

}
