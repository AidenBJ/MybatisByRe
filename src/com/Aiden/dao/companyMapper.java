package com.Aiden.dao;

import com.Aiden.domain.Company;

public interface companyMapper {
	/**
	 * ����ID��ѯ��˾����
	 * @param id
	 * @return
	 */
	public Company findCompanyById(Integer id);

}
