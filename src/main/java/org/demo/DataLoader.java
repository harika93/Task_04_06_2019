package org.demo;

import org.demo.entity.Customer;
import org.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

	@Autowired
	private CustomerRepository customerRepository;

	public DataLoader() {
		
	}

	public void run(ApplicationArguments args) {
		customerRepository.save(new Customer("AAA", "lil1"));
		customerRepository.save(new Customer("aabb", "lil2"));
		customerRepository.save(new Customer("ccD", "lil3"));
		customerRepository.save(new Customer("ccD", "lil4"));
		customerRepository.save(new Customer("ccD", "lil5"));
		customerRepository.save(new Customer("ccD", "lil6"));
		customerRepository.save(new Customer("ccD", "lil7"));
		customerRepository.save(new Customer("ccD", "lil8"));
		customerRepository.save(new Customer("ccD", "lil9"));
		customerRepository.save(new Customer("ccD", "lil10"));
		customerRepository.save(new Customer("ccD", "lil11"));
		customerRepository.save(new Customer("ccD", "lil12"));
	}
}
