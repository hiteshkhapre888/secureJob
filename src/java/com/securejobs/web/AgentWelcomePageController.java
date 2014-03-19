package com.securejobs.web;

import com.securejobs.domain.Persons;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AgentWelcomePageController {

    @RequestMapping("/Agent-Welcome-Page.htm")
    public String redirect() {
        return "Agent-Welcome-Page";
    }
}
