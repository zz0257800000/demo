package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Meal;
import com.example.demo.entity.MealId;

@Repository
public interface MealDao extends JpaRepository<Meal, MealId> {
	// findTop數字限制搜尋結果回傳筆數
	public List<Meal> findTop2ByName(String name);

	// findTop數字限制搜尋結果回傳筆數
	public List<Meal> findFirst2ByName(String name);

	// Order 排序By預設ASC
	// ASC小到大 DESC大到小
	public List<Meal> findAllByOrderByPrice();

	public List<Meal> findAllByOrderByPriceDesc();

	// 比大小
	// 1大於GreaterThan 2 大於等於GreaterThanEqual
	// 3小於LessThan 4 小於等於LessThanEqual
	public List<Meal> findByPriceGreaterThan(int price);

	// 多欄位+比大小
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
