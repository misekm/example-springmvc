package org.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public ModelAndView homePage() {

        Map<String, Object> map = new HashMap<>();

        return new ModelAndView("home", map);
    }

}
