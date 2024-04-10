package ntu.lapa.springdb.controllers;


import lombok.RequiredArgsConstructor;
import ntu.lapa.springdb.entitys.Laptop;
import ntu.lapa.springdb.services.LaptopService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class LaptopController {

    public LaptopController(LaptopService laptopService) {
        this.laptopService = laptopService;
    }

    private final LaptopService laptopService;

    @GetMapping("/laptops")
    public @ResponseBody List<Laptop> getAllLaptops(){
        return laptopService.findAll();
    }

}