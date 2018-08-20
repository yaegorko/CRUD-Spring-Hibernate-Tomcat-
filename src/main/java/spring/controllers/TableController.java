package spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import spring.dao.UserHibernateDAO;
import spring.model.User;
import spring.services.UserService;
import spring.services.UserServiceImpl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;

@Controller
public class TableController {
    private final UserServiceImpl userService;

    @Autowired
    public TableController(UserServiceImpl userService) {
        this.userService = userService;
    }


    @RequestMapping(value = "/table", method = RequestMethod.GET)
    public String list() {
        ModelAndView model = new ModelAndView("/table");
        List<User> list = userService.getAllUsers();
        model.addObject("list", list);
        return "table";
    }
}
