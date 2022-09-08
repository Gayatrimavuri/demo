package com.techwave.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpController {
@RequestMapping("/test")
public String Test()
{
return "Test";	
}
}
