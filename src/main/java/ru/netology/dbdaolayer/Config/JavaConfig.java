package ru.netology.dbdaolayer.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ru.netology.dbdaolayer.repository.ProductRepository;

import java.sql.SQLException;

@Configuration
public class JavaConfig {
    @Bean
    public ProductRepository productRepository() {
        return new ProductRepository();
    }
}
