package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CarConroller {

    @GetMapping("/cars")
    public String getCars(ModelMap model,@RequestParam(required = false) Integer count){
        System.out.println(count);
        List<Car> carArray = Car.getCars(count);
        model.addAttribute("messages", carArray);
        return "cars";
    }
}
