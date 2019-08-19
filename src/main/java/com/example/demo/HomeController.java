
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
   // private Object s;

    @RequestMapping("/")
    public String homepage(Model model){
        model.addAttribute("myvar","Say hello to the people.");
        model.addAttribute("myvar2", "greeting");
        //model.addAttribute( s: "myvar3", o: "flipslopos");
        return "hometemplate";
    }
}
