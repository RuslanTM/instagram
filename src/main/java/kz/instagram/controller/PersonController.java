package kz.instagram.controller;

import kz.instagram.dao.AbstractDao;
import kz.instagram.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

//@Controller
public class PersonController {
/*
@Autowired
@Qualifier(value = "personDao")
private AbstractDao personDao;
@ModelAttribute("persons")
    public List<Person> getAllProjects() {
        return personDao.findAll();
    }*/

    /*
@Autowired
@Qualifier(value = "projectValidator")
private ProjectValidator projectValidator;*/
 /*  @RequestMapping(value = "/getPersons", method = RequestMethod.GET)
        public String getAllPersons(){
        return "/index";

   }*/
}
