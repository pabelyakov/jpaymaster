package ru.t3adog.paymaster.infra.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "bot") // тот самый префикс
@Data
@PropertySource("classpath:application.properties")
public class BotProperties {

    String name;

    String token;

}