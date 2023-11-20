package com.example.demo;


import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.example.demo.entity.Meal;
import com.example.demo.entity.MealId;

import com.example.demo.repository.MealDao;
import com.example.demo.service.ifs.MealService;

@SpringBootTest
public class MealServiceTest {

	@Autowired
	private MealService mealService;

	@Autowired
	private MealDao mealDao;
	//�Ǩ��Ʈw��
	@Test
	public void addMeal() {
		mealService.addMeal(new Meal("beef", "BBQ", 180));
		mealService.addMeal(new Meal("beef", "fry", 150));
		mealService.addMeal(new Meal("pork", "fried", 220));
		mealService.addMeal(new Meal("chicken", "stew", 260));
		mealService.addMeal(new Meal("chicken", "BBQ", 520));
		mealService.addMeal(new Meal("chicken", "steam", 520));
	}
	//�P�_�s�W����
	@Test
	public void addMealTest() {

		Meal result = mealService.addMeal(new Meal("", "BBQ", 180));
		Assert.isTrue(result == null, "addMeal error");

		result = mealService.addMeal(new Meal("beef", "", 180));
		Assert.isTrue(result == null, "addMeal error");

		result = mealService.addMeal(new Meal("beef", "BBQ", 0));
		Assert.isTrue(result == null, "addMeal error");

		result = mealService.addMeal(new Meal("beef", "BBQ", 180));
		Assert.isTrue(result != null, "addMeal error");

		result = mealService.addMeal(new Meal("beef", "BBQ", 180));
		Assert.isTrue(result == null, "addMeal error");

		mealDao.deleteById(new MealId("beef", "BBQ"));

	}
	//����ⵧ���
	@Test
	public void limitTest() {
		List<Meal> res = mealDao.findTop2ByName("chicken");
		System.out.println(res.size());
		Assert.isTrue(res.size() == 2, "fimd limit error");
	}
	//��W�������Ʀr��������۰ʱq�j�ƨ�p
	@Test
	public void orderByTest() {
		List<Meal> res = mealDao.findAllByOrderByPrice();
		for (Meal item : res) {
			System.out.println(item.getName() + item.getCookingStyle() + " : " + item.getPrice());
		}
	}
	//��W�������Ʀr �j��200����
	@Test
	public void compareTest() {
		List<Meal> res = mealDao.findByPriceGreaterThan(200);
		for (Meal item : res) {
			System.out.println(item.getName() + item.getCookingStyle() + " : " + item.getPrice());
		}
	}
	//��W�������Ʀr �Ĥ@�榳e�åB�ĤG�榳b �~����
	@Test
	public void containingTest() {
		List<Meal> res = mealDao.findByNameContainingAndCookingStyleContaining("e", "b");

		for (Meal item : res) {
			System.out.println(item.getName() + item.getCookingStyle() + " : " + item.getPrice());
		}
	}
	//��W�������Ʀr�b100-300����
	@Test
	public void betweenTest() {

		List<Meal> res = mealDao.findByPriceBetween(100, 300);

		for (Meal item : res) {
			System.out.println(item.getName() + item.getCookingStyle() + " : " + item.getPrice());
		}
	}
//��W�������Ʀr
	@Test
	public void inTest() {
		List<Meal> res = mealDao.findByPriceIn(new ArrayList<>(List.of(100, 120, 150, 180, 200)));
		for (Meal item : res) {
			System.out.println(item.getName() + item.getCookingStyle() + " : " + item.getPrice());
		}
	}

//	private Menu addMeal(Meal meal) {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
