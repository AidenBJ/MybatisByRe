package com.Aiden.dao;

import java.util.List;

import com.Aiden.domain.Person;

public interface personMapper {
	/**
	 * �����Ա
	 * @param person
	 */
	public void addPerson(Person person);
	/**
	 * ɾ����Ա
	 * @param id
	 */
	public void deletePerson(Integer id);
	/**
	 * ������Ա
	 * @param person
	 */
	public void updatePerson(Person person);
	/**
	 * ����Id������Ա
	 * @param id
	 * @return
	 */
	public Person findPersonById(Integer id);
	/**
	 * ��ѯ������Ա
	 * @return
	 */
	public List<Person> findPerson();
	/**
	 * ����ID��ѯ��Ա����ַ��Ϣ
	 * @param id
	 * @return
	 */
	public List<Person> findPersonWithAddressById(Integer id);
	/**
	 * ���ݹ�˾Id��ѯ��Ա��Ϣ
	 * @param id
	 * @return
	 */
	public List<Person> findPersonWithByCompanyId(Integer companyId);
}
