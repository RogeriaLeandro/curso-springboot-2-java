package com.rogerialeandro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rogerialeandro.course.entities.Category;

//não recebe a annotation @Repository pois JPARepository já é um respositório.
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	
	
}
