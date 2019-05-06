package com.Aiden.service;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.Aiden.dao.addressMapper;
import com.Aiden.dao.companyMapper;
import com.Aiden.dao.personMapper;
import com.Aiden.domain.Address;
import com.Aiden.domain.Company;
import com.Aiden.domain.Person;
import com.Aiden.util.SqlSessionFactoryUtil;
/**
 * һ��һ��һ�Զ��ϵӳ��
 * @author ����Ծ
 *
 */
public class MybatisDemo02 {
	private static Logger logger=Logger.getLogger(MybatisDemo02.class);
	private static SqlSession sqlSession=null;
	private static personMapper personMapper=null;
	private static addressMapper am = null;
	private static companyMapper cm = null;

	@Before
	public void setUp() throws Exception {
		sqlSession=SqlSessionFactoryUtil.openSession();
		System.out.println(sqlSession);
		personMapper=sqlSession.getMapper(personMapper.class);
		am=sqlSession.getMapper(addressMapper.class);
		cm=sqlSession.getMapper(companyMapper.class);
	}

	@After
	public void tearDown() throws Exception {
		sqlSession.close();
	}

	@Test
	public void testFindPersonWithAddressById() {
		logger.info("һ��һ��ϵӳ�䡪����ѯ��Ա����ַ");
		List<Person> person=personMapper.findPersonWithAddressById(5);
		for (Person p : person) {
			System.out.println(p);	
		}
	}
	
	@Test
	public void testFindPersonWithByCompanyId() {
		logger.info("һ�Զ��ϵӳ�䡪�����ݹ�˾ID��ѯ��Ա");
		List<Person> person=personMapper.findPersonWithByCompanyId(1);
		for (Person p : person) {
			System.out.println(p);	
		}
	}
	
	@Test
	public void test() {
		Address address=am.findAddressById(3);
		System.out.println(address);
	}
	
	@Test
	public void testCompany() {
		Company company = cm.findCompanyById(2);
		System.out.println(company);
	}

}
