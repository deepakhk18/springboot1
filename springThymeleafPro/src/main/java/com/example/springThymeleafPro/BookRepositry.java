package com.example.springThymeleafPro;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface BookRepositry  extends CrudRepository<Book,Long>{
	List<Book>findByTitle(String title);

}
