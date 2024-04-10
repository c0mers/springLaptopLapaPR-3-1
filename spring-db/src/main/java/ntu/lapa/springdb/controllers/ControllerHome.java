package ntu.lapa.springdb.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class ControllerHome {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Lapa Pavlo");
        return "home";
    }

}

