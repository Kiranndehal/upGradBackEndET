package com.example.upGradET.repository;

import com.example.upGradET.model.Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SearchRepo extends JpaRepository<Details,Integer> {


    Details findByName(String name);
}
