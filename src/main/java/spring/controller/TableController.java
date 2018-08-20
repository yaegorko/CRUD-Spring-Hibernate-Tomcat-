package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import spring.model.User;
import spring.services.UserService;

import javax.persistence.PersistenceContext;
import java.util.List;

@Controller
public class TableController {
    private final UserService userService;

    @Autowired
    public TableController(UserService userService) {
        this.userService = userService;
    }



    @RequestMapping(value = "/table", method = RequestMethod.GET)
    public String listUsers(Model model) {
        List<User> list = userService.getAllUsers();
        model.addAttribute("list", list);
        return "admin/table";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateUser(@RequestParam("update") String id, Model model) {
        String string = "Update";
        model.addAttribute("string", string);
        String suffix = "user";
        model.addAttribute("suffix", suffix);
        User user = userService.getById(Integer.parseInt(id));
        model.addAttribute("user", user);
        return "admin/create";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createUser(Model model) {
        String action = "Create";
        model.addAttribute("string", action);
        String suffix = "new user";
        model.addAttribute("suffix", suffix);
        return "admin/create";
    }
}
