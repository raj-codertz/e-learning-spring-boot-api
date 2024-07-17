package com.suinegraj.datajpa.repositories;

import com.suinegraj.datajpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
