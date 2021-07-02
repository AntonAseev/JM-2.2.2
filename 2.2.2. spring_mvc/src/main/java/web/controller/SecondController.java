package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class SecondController {

    @GetMapping("/cars")
    public String carsView(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        model.addAttribute("messages", CarService.getNeedCountCars(count));
        return "cars";
    }
}
