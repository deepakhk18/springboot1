package com.example.springThymeleafPro;

import java.util.List;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
@EnableJpaRepositories("com.example.springThymeleafPro")
public interface BookRepositry  extends CrudRepository<Book,Long>{
	List<Book>findByTitle(String title);

}
