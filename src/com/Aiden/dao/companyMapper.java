package com.Aiden.dao;

import com.Aiden.domain.Company;

public interface companyMapper {
	/**
	 * 根据ID查询公司详情
	 * @param id
	 * @return
	 */
	public Company findCompanyById(Integer id);

}
