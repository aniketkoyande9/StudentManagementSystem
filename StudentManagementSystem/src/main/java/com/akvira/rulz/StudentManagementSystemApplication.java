package com.akvira.rulz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
@ComponentScan({"com.akvira.rulz"})
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// Student student1 = new Student("Aniket","Koyande","akvira@gmail.com");
		//studentrepository.save(student1);
		
		//Student student2 = new Student("Aniket1","Koyande1","akvira1@gmail.com");
		//studentrepository.save(student2);
		
		//Student student3 = new Student("Aniket2","Koyande2","akvira2@gmail.com");
		// studentrepository.save(student3);
		
	}

}
