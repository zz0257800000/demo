package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.entity.PersonInfo;

@Repository
public interface PersonInfoDao extends JpaRepository<PersonInfo, String> {

	public List<PersonInfo> findByCity(String city);

	public List<PersonInfo> findByNameAndCity(String name, String city);

	public List<PersonInfo> findByNameOrCity(String name, String city);

	// 3
	public Optional<PersonInfo> findById(String id);

	// 4
	public List<PersonInfo> findAllByAgeGreaterThan(int age);

	// 5
	public List<PersonInfo> findAllByAgeLessThanOrderByAge(int age);

	// 6
	public List<PersonInfo> findByAgeLessThanOrAgeGreaterThan(int age, int age2);

	// 7
	public List<PersonInfo> findByAgeBetweenOrderByAgeDesc(int min, int max);

	// 8
	public List<PersonInfo> findAllByCityContaining(String city);
	// 9
	public List<PersonInfo> findAllByAgeGreaterThanAndCityContainingOrderByAgeDesc(int age, String city);
}
