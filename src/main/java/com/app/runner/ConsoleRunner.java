package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;

@Component
public class ConsoleRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;
	@Override
	public void run(String... args) throws Exception {
		//		 save the data in table 
		
		  repo.save(new Product(10,"A",10.0)); repo.save(new Product(11,"B",11.1));
		  repo.save(new Product(12,"C",12.2)); repo.save(new Product(13,"D",13.3));
		 
		 
		//update call
		/* repo.save(new Product(11,"bha",100.1)); */
		
		//bulk insert
		/*
		 * List<Product> prds=Arrays.asList( new Product(101,"AA",9.9), new
		 * Product(102,"BB",8.8), new Product(103,"CC",7.7), new Product(104,"DD",6.6));
		 * repo.saveAll(prds);
		 */
		
		//Fetch One Row
		/*
		 * Optional<Product> p=repo.findById(101); if(p.isPresent())//avoid nullPointer
		 * Exception { Product prd=p.get(); System.out.println(prd.getProdCode()); }
		 * else { System.out.println("Row Not Found"); }
		 */
		
		//Fetch The All Rows
		/*
		 * List<Product> lis=repo.findAll(); lis.forEach(System.out::println);
		 */
		
		//Delete one row from table
		/* repo.deleteById(13); */
		
		//Delete All Rows
		/* repo.deleteAll(); */
		//by batch delete
		/* repo.deleteAllInBatch(); */
	}

}
