package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.entity.PersonInfo;
import com.example.demo.repository.PersonInfoDao;
import com.example.demo.service.ifs.PersonInfoService;

@SpringBootTest(classes = DemoApplication.class)
public class PersonInfoServiceTest {

	@Autowired
	private PersonInfoService personInfo;

	@Autowired
	private PersonInfoDao personInfoDao;

	@Test
	public void addInfoTest() {
		personInfo.addInfo(new PersonInfo("A123456487", "玉祥", 52, "新北"));// 傳到後端

	}

	@Test
	public void addInfoTest2() {
		List<PersonInfo> list = new ArrayList<>();
		list.add(new PersonInfo("d123456487", "辰", 42, "台北"));
		list.add(new PersonInfo("e123456487", "家", 12, "高北")); // 傳到後端//傳到後端印出
		personInfo.addInfoList(list);
	}

	@Test
	public void daoSaveALLTest() {
		List<PersonInfo> list = new ArrayList<>();
		list.add(new PersonInfo("B123456487", "昱辰", 42, "台北"));
		list.add(new PersonInfo("C123456487", "家昱", 12, "高北"));// 傳到後端印出
		personInfoDao.saveAll(list);
	}

//		@Test
//		public void daoSaveALLTestD() {
//		personInfoDao.deleteAll();
//
//}
	@Test
	public void daoFindTest() {
		Optional<PersonInfo> infoOp = personInfoDao.findById("A123456487");
		if (infoOp.isEmpty()) {
			System.out.println("not found");
			return;
		}
		System.out.println(infoOp.get().getName()); // 找後端資料印單一所有有輸入的名字

	}

	@Test
	public void daoFindTest2() {

		List<PersonInfo> list = personInfoDao.findAll();

		for (PersonInfo item : list) {
			System.out.println(item.getName()); // 找後端資料印所有有輸入的名字
		}
	}

	@Test
	public void daoFindTest3() {
		boolean result = personInfoDao.existsById("A123456487");
		System.out.println(result); // 找後端資料email當鑰匙pk確認有沒有重複

	}

	@Test
	public void daoFindTest4() {
		List<PersonInfo> result = personInfoDao.findByNameAndCity("昱辰", "台北");
		for (PersonInfo item : result) {

			System.out.println(item.getName()); // 找後端資料印城市有台北的

		}

	}

	@Test
	public void findByIdTest() {
		/* id存在 */
		Optional<PersonInfo> op = personInfoDao.findById("A123456487");
		System.out.println(op.get().getName());
		/* id不存在(爆錯) */
		Optional<PersonInfo> op2 = personInfoDao.findById("A123488800");
		System.out.println(op2.get().getName());
	}

	@Test
	public void findAllByAgeGreaterThanTest() {
		List<PersonInfo> personInfo = personInfoDao.findAllByAgeGreaterThan(15);

		System.out.println("總共" + personInfo.size() + "筆資料");
		for (PersonInfo item : personInfo) {
			System.out.printf("id:%s name:%s age:%d city:%s\n", item.getId(), item.getName(), item.getAge(),
					item.getCity());
		}
	}

	// 5
	@Test
	public void findAllByAgeLessThanOrderByAgeTest() {
		List<PersonInfo> personInfo = personInfoDao.findAllByAgeLessThanOrderByAge(30);

		System.out.println("總共" + personInfo.size() + "筆資料");
		for (PersonInfo item : personInfo) {
			System.out.printf("id:%s name:%s age:%d city:%s\n", item.getId(), item.getName(), item.getAge(),
					item.getCity());
		}

	}

	// 6
	@Test
	public void findByAgeLessThanOrAgeGreaterThanTest() {

		List<PersonInfo> personInfo = personInfoDao.findByAgeLessThanOrAgeGreaterThan(15, 40);

		System.out.println("總共" + personInfo.size() + "筆資料");
		for (PersonInfo item : personInfo) {
			System.out.printf("id:%s name:%s age:%d city:%s\n", item.getId(), item.getName(), item.getAge(),
					item.getCity());
		}
	}

	// 7
	@Test
	public void findByAgeBetweenOrderByAgeDescTest() {
		List<PersonInfo> personInfo = personInfoDao.findByAgeBetweenOrderByAgeDesc(15, 40);

		System.out.println("總共" + personInfo.size() + "筆資料");
		for (PersonInfo item : personInfo) {
			System.out.printf("id:%s name:%s age:%d city:%s\n", item.getId(), item.getName(), item.getAge(),
					item.getCity());
		}

	}
	// 8
		@Test
		public void findAllByCityContainingTest() {
			List<PersonInfo> personInfo = personInfoDao.findAllByCityContaining("Taipei");
			
			System.out.println("總共" + personInfo.size() + "筆資料");
			for (PersonInfo item : personInfo) {
				System.out.printf("id:%s name:%s age:%d city:%s\n", item.getId(), item.getName(), item.getAge(),
						item.getCity());
			}
		}
		// 9
				@Test
				public void findAllByAgeGreaterThanAndCityContainingOrderByAgeDescTest() {
					List<PersonInfo> personInfo = personInfoDao.findAllByAgeGreaterThanAndCityContainingOrderByAgeDesc(0, "t");
					
					System.out.println("總共" + personInfo.size() + "筆資料");
					for (PersonInfo item : personInfo) {
						System.out.printf("id:%s name:%s age:%d city:%s\n", item.getId(), item.getName(), item.getAge(),
								item.getCity());
					}
				}
}