package com.techwave.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techwave.model.dao.EmployeeDao;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeDao employeeDao;

@RequestMapping("/")
public String Extract(Model M)
{
	M.addAttribute("lemp",employeeDao.Extract());
	return "Extract";
}
}
