package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessImagesRepository extends JpaRepository<MessImagesRepository, Integer> {

}
