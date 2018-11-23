package com.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.abc.dao.EmpDao;
import com.abc.entity.Emp;
import com.abc.service.EmpService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/applicationContext.xml"})
public class Test1 {
	
	@Resource
	private EmpService empServiceImpl;
	@Resource
	private RedisTemplate<String, String> redisTemplate;
	
	@Test
	public void test() {
		Emp emp = new Emp();
		emp.setName("测试");
		emp.setAge(19);
		emp.setSalary(1500.15);
		empServiceImpl.save(emp);
		redisTemplate.opsForValue().set("aa", "ddd555");
	}
}
