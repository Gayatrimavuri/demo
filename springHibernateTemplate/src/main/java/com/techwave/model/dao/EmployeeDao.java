package com.techwave.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.techwave.model.pojo.Emp;

public class EmployeeDao {

HibernateTemplate hibernatetemplate;

public List<Emp> Extract()
{
	return	hibernatetemplate.loadAll(Emp.class);
}

public void setHibernatetemplate(HibernateTemplate hibernatetemplate) {
	this.hibernatetemplate = hibernatetemplate;
}


}
