package kz.instagram.controller;

import kz.instagram.dao.AbstractDao;
import kz.instagram.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class TestController {
    @Autowired
    @Qualifier(value = "personDao")
    private AbstractDao personDao;

    @RequestMapping("/")
    public String foo() {
        return "redirect:/persons";
    }


    @ModelAttribute("persons")
    public List<Person> getAllProjects() {
        return personDao.findAll();
    }
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getAjaxPage() {
        return "/index";
    }


    @RequestMapping(value = "/persons", method = RequestMethod.GET)
    public String getAllPersons(Model model){
        model.addAttribute("person", new Person());
        return "/index";
    }
}
