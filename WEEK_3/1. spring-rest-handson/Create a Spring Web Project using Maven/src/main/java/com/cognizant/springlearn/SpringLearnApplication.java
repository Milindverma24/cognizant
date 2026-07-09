package com.cognizant.springlearn;

import com.cognizant.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication(scanBasePackages = "com.cognizant")
public class SpringLearnApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {

        LOGGER.info("Spring Boot Application Started");

        SpringApplication.run(SpringLearnApplication.class, args);

        ApplicationContext context =
                new ClassPathXmlApplicationContext("employee.xml");

        Employee employee = context.getBean("employee", Employee.class);

        LOGGER.info(employee.toString());
    }
}