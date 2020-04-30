package com.abdulmansour.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    //controller to show the form
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    //controller to process the form
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    //controller to process the form and store value in our model
    @RequestMapping("/processForm2")
    public String processForm2(HttpServletRequest request, Model model) {
        String studentName = request.getParameter("studentName");
        String message = "Yo! " + studentName.toUpperCase();
        model.addAttribute("message", message);

        return "helloworld";
    }

    //controller to process the form and store value in our model using RequestParam annotation to fetch the form data
    @RequestMapping("/processForm3")
    public String processForm3(@RequestParam("studentName") String studentName, Model model) {
        String message = "Hey! " + studentName.toUpperCase();
        model.addAttribute("message", message);

        return "helloworld";
    }

}
