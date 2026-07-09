package com.cognizant.springlearn;

import com.cognizant.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication(scanBasePackages = "com.cognizant")
public class SpringLearnApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {

        LOGGER.info("Spring Boot Application Started");

        SpringApplication.run(SpringLearnApplication.class, args);

        loadEmployeeBean();

        displayDate();

    }

    public static void loadEmployeeBean() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("employee.xml");

        Employee employee =
                context.getBean("employee", Employee.class);

        LOGGER.info(employee.toString());

    }

    public static void displayDate() {

        try {

            ApplicationContext context =
                    new ClassPathXmlApplicationContext("date-format.xml");

            SimpleDateFormat format =
                    context.getBean("dateFormat", SimpleDateFormat.class);

            Date date = format.parse("31/12/2018");

            System.out.println("Parsed Date : " + date);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }
}