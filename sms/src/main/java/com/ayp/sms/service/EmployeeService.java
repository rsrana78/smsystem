package com.ayp.sms.service;

import java.util.List;

import com.ayp.sms.domain.EmployeeType;
import com.ayp.sms.domain.Qualification;

public interface EmployeeService {
	
	public List<EmployeeType> getEmployeeTypeList();
	public List<Qualification> getQualificationList();

}
