package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.example.demo.entity.Menu;
import com.example.demo.repository.MenuDao;
import com.example.demo.service.ifs.MenuService;

@SpringBootTest(classes = DemoApplication.class)
public class MenuServiceTest {
	@Autowired
	private MenuService menuService;

	@Autowired
	private MenuDao menuDao;
	
	
	@Test
	public void addMenuTest() {
		Menu result = menuService.addMenu(new Menu("", 120));
		Assert.isTrue(result == null, "addMenu error");

		result = menuService.addMenu(new Menu("chicken", 0));
		Assert.isTrue(result == null, "addMenu error");

		result = menuService.addMenu(new Menu("fish1", 120));
		Assert.isTrue(result == null, "addMenu error");

		result = menuService.addMenu(new Menu("fish1", 150));
		result = menuService.updateMenu(new Menu("fish1", 150));

		Assert.isTrue(result == null, "addMenu error");
		Assert.isTrue(result.getPrice() == 150 , "addMenu error");

		menuDao.deleteById("fish1");
	}
	@Test
	public void findByNameTest() {
		Menu result = menuService.findByName("");
		Assert.isTrue(result == null, "findByName error");
		 result = menuService.findByName("fish1");
		Assert.isTrue(result == null, "findByName error");
		
		 result = menuService.addMenu(new Menu("fish1", 120));

		 result = menuService.findByName("fish1");
			Assert.isTrue(result != null, "findByName error");

			menuDao.deleteById("fish1");
}
}
	