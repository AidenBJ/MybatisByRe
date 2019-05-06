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
 * ��ͨ��ɾ�Ĳ����
 * @author ����Ծ
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
		logger.info("�����Ա");
		Person person=new Person("������",24);
		personMapper.addPerson(person);
		sqlSession.commit();
	}
	
	@Test
	public void testUpdatePerson() {
		logger.info("�޸���Ա");
		Person person=new Person(2,"������",24);
		personMapper.updatePerson(person);
		sqlSession.commit();
	}
	
	@Test
	public void testFindPersonById() {
		logger.info("����ID��ѯ��Ա");
		Person person = personMapper.findPersonById(2);
		System.out.println(person);
	}
	
	@Test
	public void testFindPerson() {
		logger.info("��ѯ������Ա");
		List<Person> allPerson = personMapper.findPerson();
		for (Person person : allPerson) {
			System.out.println(person);
		}
	}
	
	@Test
	public void testDeletePerson() {
		logger.info("ɾ����Ա");
		personMapper.deletePerson(2);
		sqlSession.commit();
	}

}
