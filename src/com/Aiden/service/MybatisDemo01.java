package com.Aiden.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.Aiden.dao.personMapper;
import com.Aiden.domain.Person;
import com.Aiden.util.SqlSessionFactoryUtil;
/**
 * 普通增删改查操作
 * @author 郭祥跃
 *
 */
public class MybatisDemo01 {
	private static Logger logger=Logger.getLogger(MybatisDemo01.class);
	private static SqlSession sqlSession=null;
	private static personMapper personMapper=null;

	@Before
	public void setUp() throws Exception {
		sqlSession=SqlSessionFactoryUtil.openSession();
		personMapper=sqlSession.getMapper(personMapper.class); 
	}

	@After
	public void tearDown() throws Exception {
		sqlSession.close();
	}

	@Test
	public void testAddPerson() {
		logger.info("添加人员");
		Person person=new Person("饭岛爱",24);
		personMapper.addPerson(person);
		sqlSession.commit();
	}
	
	@Test
	public void testUpdatePerson() {
		logger.info("修改人员");
		Person person=new Person(2,"武藤兰",24);
		personMapper.updatePerson(person);
		sqlSession.commit();
	}
	
	@Test
	public void testFindPersonById() {
		logger.info("根据ID查询人员");
		Person person = personMapper.findPersonById(2);
		System.out.println(person);
	}
	
	@Test
	public void testFindPerson() {
		logger.info("查询所有人员");
		List<Person> allPerson = personMapper.findPerson();
		for (Person person : allPerson) {
			System.out.println(person);
		}
	}
	
	@Test
	public void testDeletePerson() {
		logger.info("删除人员");
		personMapper.deletePerson(2);
		sqlSession.commit();
	}

}
