package com.securejobs.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
@RequestMapping("Agent-Login.htm")
public class AgentLoginController {
    
    public AgentLoginController() {
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public String getCurrentPage() {
             return "Agent-Login";
    }
    
}
