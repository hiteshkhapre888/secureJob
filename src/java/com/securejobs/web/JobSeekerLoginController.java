package com.securejobs.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("Jobseeker-Login.htm")
public class JobSeekerLoginController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String getCurrentPage() {
        return "Jobseeker-Login";
    }
}
