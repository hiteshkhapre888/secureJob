package com.securejobs.web;

import com.securejobs.domain.Persons;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("Jobseeker-Registration.htm")
@SessionAttributes("persons")
public class JobseekerRegistrationController {

    @RequestMapping(method = RequestMethod.GET)
    public String getCurrentPage(ModelMap model) {
        Persons person = new Persons();
        model.addAttribute(person);
        return "Jobseeker-Registration";
    }
}
