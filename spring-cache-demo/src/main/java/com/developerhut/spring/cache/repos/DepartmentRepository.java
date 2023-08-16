package com.developerhut.spring.cache.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.developerhut.spring.cache.model.Customer_Info;

public interface DepartmentRepository extends JpaRepository<Customer_Info, Integer> {

}
