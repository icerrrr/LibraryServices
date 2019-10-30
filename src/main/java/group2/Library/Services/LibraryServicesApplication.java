package group2.Library.Services;

import group2.Library.DBInterfaces.UserRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"group2.Library.Services.Controller"})
public class LibraryServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryServicesApplication.class, args);
	}
}


