package fr.mygms.vendredi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VendrediConsoleApplication implements CommandLineRunner {
	
	private static Logger logger = LoggerFactory.getLogger(VendrediConsoleApplication.class);
	
    public static void main(String[] args) throws Exception {
        SpringApplication.run(VendrediConsoleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
	
    	logger.info("**********************");
    	logger.info("** LANCEMENT DU JEU **");
    	logger.info("**********************");
    }
}
