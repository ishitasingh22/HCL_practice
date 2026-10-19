package org.example.HRMS;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Address address() {
        return new Address("Ghaziabad", "Uttar Pradesh", "201009");
    }

    @Bean
    public Salary salary() {
        return new Salary(30000, 5000, 10000);
    }

    @Bean
    public Department department() {
        return new Department("IT");
    }

    @Bean
    public Employee employee() {
        return new Employee(
                101,
                "Ishita",
                address(),
                salary(),
                department()
        );
    }
}
