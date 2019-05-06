package com.Aiden.dao;

import com.Aiden.domain.Address;

public interface addressMapper {
	/**
	 * 根据ID查询地址消息
	 * @param id
	 * @return
	 */
	public Address findAddressById(Integer id);
}
