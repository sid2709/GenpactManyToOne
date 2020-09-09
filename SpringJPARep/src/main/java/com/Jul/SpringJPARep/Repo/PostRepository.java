package com.Jul.SpringJPARep.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Jul.SpringJPARep.Bean.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}