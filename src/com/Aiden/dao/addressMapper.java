package com.Aiden.dao;

import com.Aiden.domain.Address;

public interface addressMapper {
	/**
	 * ����ID��ѯ��ַ��Ϣ
	 * @param id
	 * @return
	 */
	public Address findAddressById(Integer id);
}
