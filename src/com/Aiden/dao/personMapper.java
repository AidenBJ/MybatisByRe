package com.Aiden.dao;

import java.util.List;

import com.Aiden.domain.Person;

public interface personMapper {
	/**
	 * 添加人员
	 * @param person
	 */
	public void addPerson(Person person);
	/**
	 * 删除人员
	 * @param id
	 */
	public void deletePerson(Integer id);
	/**
	 * 更新人员
	 * @param person
	 */
	public void updatePerson(Person person);
	/**
	 * 根据Id查找人员
	 * @param id
	 * @return
	 */
	public Person findPersonById(Integer id);
	/**
	 * 查询所有人员
	 * @return
	 */
	public List<Person> findPerson();
	/**
	 * 根据ID查询人员及地址信息
	 * @param id
	 * @return
	 */
	public List<Person> findPersonWithAddressById(Integer id);
	/**
	 * 根据公司Id查询人员信息
	 * @param id
	 * @return
	 */
	public List<Person> findPersonWithByCompanyId(Integer companyId);
}
