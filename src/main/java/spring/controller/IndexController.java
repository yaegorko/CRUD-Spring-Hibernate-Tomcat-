package spring.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import static javafx.scene.input.KeyCode.M;

@Controller
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String toTable() {
        ModelAndView andView = new ModelAndView();
        return "redirect:/table" ;
    }

//    @RequestMapping(path={"/"}, method=RequestMethod.GET)
//    public String sayHello(Model model) {
//        model.addAttribute("message","Hello Spring MVC!");
//        //Java 8 LocalDate
//        DateTimeFormatter formatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
//        LocalDate date=LocalDate.now();
//        model.addAttribute("date", date.format(formatter));
//        return "index";
//    }
}