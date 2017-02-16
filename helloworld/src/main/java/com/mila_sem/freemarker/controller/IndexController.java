package com.mila_sem.freemarker.controller;

import com.mila_sem.freemarker.dto.Office;
import com.mila_sem.freemarker.service.DzItemService;
import com.mila_sem.freemarker.service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private DzItemService dzItemService;

    @Autowired
    private OfficeService officeService;

    @RequestMapping("/")
    public ModelAndView index(ModelAndView view) {
        view.addObject("title", "Home page");
        view.addObject("services", dzItemService.getItems());
        view.setViewName("index");
        return view;
    }

    @RequestMapping("/contacts")
    public ModelAndView contacts(ModelAndView view) {
        List<Office> offices = officeService.getOffices();
        view.addObject("title", "Contacts");
        view.addObject("offices", offices);
        view.addObject("count", offices.size());
        view.setViewName("contacts");
        return view;
    }

    @RequestMapping("/about")
    public String info(ModelMap view) {
        view.addAttribute("title", "About Digital Zone");
        return "about";
    }
}
