package ru.myproject.less1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ru.myproject.less1.beans, ru.myproject.less1.repositorys")
public class AppConfig {
}
