package com.abdulmansour.controller;

import com.abdulmansour.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {

    //get the properties values; properties files are added in the Spring config file
    @Value("#{countryOptions}")
    private Map<String, String> countryOptions;
    @Value("#{favoriteCodingLanguages}")
    private Map<String, String> favoriteCodingLanguages;
    @Value("#{operatingSystems}")
    private Map<String, String> operatingSystems;

    //Timestamp formatter
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");

    @RequestMapping("/showForm")
    public String showForm(Model model) {
        String timestamp = sdf.format(new Timestamp(System.currentTimeMillis()));
        System.out.println(timestamp + " ------Controller: showForm - student/showForm------");

        //create student object and pass to the model
        model.addAttribute("student", new Student());
        //add the countryOptions to the model
        model.addAttribute("countryOptions", countryOptions);
        //add the favoriteCodingLanguages to the model
        model.addAttribute("favoriteCodingLanguages", favoriteCodingLanguages);
        //add the operatingSystems to the model
        model.addAttribute("operatingSystems", operatingSystems);

        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student student) {
        String timestamp = sdf.format(new Timestamp(System.currentTimeMillis()));
        System.out.println(timestamp + " ------Controller: processForm - student/processForm------");

        System.out.println("First name: " + student.getFirstName());
        System.out.println("Last name: " + student.getLastName());
        System.out.println("Country: " + student.getCountry());
        System.out.println("Favorite Coding Language: " + student.getCountry());
        System.out.println("Operating Systems: ");
        for (String op:student.getOperatingSystems())
            System.out.println(op + " ");
        return "student-confirmation";
    }
}
