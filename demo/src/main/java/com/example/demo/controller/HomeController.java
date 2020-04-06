package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dao.CourseDao;
import com.example.demo.model.Course;

@Controller
public class HomeController {
	
	@Autowired
	private CourseDao dao;
@RequestMapping(value="/home",method=RequestMethod.GET)
public String home()
{
	return "homepage";
}
@RequestMapping(value="/addcourse",method=RequestMethod.GET)
public String course(Model model)
{
	Course c=new Course();
	model.addAttribute("course",c);
	return "addcourse";
}
@RequestMapping(value="/course",method=RequestMethod.POST)
public String course(@ModelAttribute("course")Course course)
{
	//Course c=new Course();
	System.out.println(course);
	return "home";
}

}

