package com.exercise.calculator.controllers;

import com.exercise.calculator.model.Data;
import com.exercise.calculator.model.OtherCalculation;
import com.exercise.calculator.model.SimpleCalculation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculationController {

    private Data data;
    private SimpleCalculation simpleCalculation;
    private OtherCalculation otherCalculation;


    @GetMapping("/")
    public String inputData(Model model){
        model.addAttribute("data", data);
        return "index";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute("data")Data data, ModelMap map) {
        map.addAttribute("result", simpleCalculation.add(data.getA(), data.getB()));
        return "index";
    }

    @PostMapping("/sub")
    public String sub(@ModelAttribute("data")Data data, ModelMap map) {
        map.addAttribute("result", simpleCalculation.substraction(data.getA(), data.getB()));
        return "index";
    }

    @PostMapping("/multi")
    public String multi(@ModelAttribute("data")Data data, ModelMap map) {
        map.addAttribute("result", simpleCalculation.multiplication(data.getA(), data.getB()));
        return "index";
    }

    @PostMapping("/div")
    public String div(@ModelAttribute("data")Data data, ModelMap map) {
        map.addAttribute("result", simpleCalculation.division(data.getA(), data.getB()));
        return "index";
    }

    @PostMapping("/percent")
    public String percent(@ModelAttribute("data")Data data, ModelMap map) {
        map.addAttribute("result", simpleCalculation.percentOf(data.getA(), data.getB()));
        return "index";
    }

    @PostMapping("/pow")
    public String power(@ModelAttribute("data")Data data, ModelMap map) {
        map.addAttribute("result", simpleCalculation.powerOf(data.getA(), data.getB()));
        return "index";
    }
}
