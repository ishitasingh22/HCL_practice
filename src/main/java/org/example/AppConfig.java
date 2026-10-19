
package org.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class AppConfig {

    @Bean
    public Employee employee() {
        Employee employee1 = new Employee();
        return employee1;
    }
}
