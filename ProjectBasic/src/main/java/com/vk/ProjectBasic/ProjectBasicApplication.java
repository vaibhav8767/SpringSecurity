package com.vk.ProjectBasic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.vk.ProjectBasic")
@EnableJpaRepositories(basePackages = "com.vk.ProjectBasic.repository")
public class ProjectBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectBasicApplication.class, args);
		System.out.println("Application is Sarted...");
	}

}
