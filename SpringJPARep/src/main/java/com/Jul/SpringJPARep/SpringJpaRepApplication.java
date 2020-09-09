package com.Jul.SpringJPARep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringJpaRepApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaRepApplication.class, args);
	}

}
// Create Post 	   	       POST	     /posts
// Posts           		   GET		 /posts?page=0&size=2&sort=createdAt,des
// Create Comment  		   POST      /posts/{postId}/comments
//Get paginated comments   GET       /posts/{postId}/comments?page=0&size=3&sort=createdAt,desc
