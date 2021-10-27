package com.fatou.demoJpa14;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fatou.demoJpa14.dao.Person;
import com.fatou.demoJpa14.dao.PersonJdbcDao;

@SpringBootApplication
public class DemoJpa14Application implements CommandLineRunner{
	
	private Logger bintou = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDao fatou;

	public static void main(String[] args) {
		SpringApplication.run(DemoJpa14Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	bintou.info("All users -> {} ", fatou.findAll());
	bintou.info("users id 10001 -> {}", fatou.findById(10001));
	
	bintou.info("Deleting 10002 -> No of Rows Deleted - {}",
			fatou.deleteById(10002));
		
		bintou.info("Inserting 10004 -> {}",
				fatou.insert(new Person(10004, "lamine", "Dakar", new Date())));
		bintou.info("Update 10003  -> {}",
				fatou.update(new Person(10003, "mbengue", "Usa", new Date())));
		
	}
		
	}


