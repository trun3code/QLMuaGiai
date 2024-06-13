package net.trung.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.trung.sms.entity.Season;
import net.trung.sms.repository.SeasonRepository;

@SpringBootApplication
public class SeasonManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SeasonManagementSystemApplication.class, args);
	}

	@Autowired
	private SeasonRepository seasonRepository;
	
	@Override
	public void run(String... args) throws Exception {
	
	}

}
