package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Meal;
import com.example.demo.entity.MealId;

@Repository
public interface MealDao extends JpaRepository<Meal, MealId> {
	// findTop�Ʀr����j�M���G�^�ǵ���
	public List<Meal> findTop2ByName(String name);

	// findTop�Ʀr����j�M���G�^�ǵ���
	public List<Meal> findFirst2ByName(String name);

	// Order �Ƨ�By�w�]ASC
	// ASC�p��j DESC�j��p
	public List<Meal> findAllByOrderByPrice();

	public List<Meal> findAllByOrderByPriceDesc();

	// ��j�p
	// 1�j��GreaterThan 2 �j�󵥩�GreaterThanEqual
	// 3�p��LessThan 4 �p�󵥩�LessThanEqual
	public List<Meal> findByPriceGreaterThan(int price);

	// �h���+��j�p
	public List<Meal> findByNameAndPriceGreaterThan(String name, int price);
	//containing
	
	public List<Meal> findByNameContaining(String name);

	
	public List<Meal> findByNameContainingAndCookingStyleContaining(String name,String cookingStyle);
	//between
	public List<Meal> findByPriceBetween(int price1, int price2);
	
	public List<Meal> findByPriceOrderByPrice(int price);

	//in
	public List<Meal> findByPriceIn(List<Integer> priceList);
	//not in
		public List<Meal> findByPriceNotIn(List<Integer> priceList);
		
}
