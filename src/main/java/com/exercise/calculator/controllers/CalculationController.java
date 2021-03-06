package com.exercise.calculator.controllers;

import com.exercise.calculator.model.Data;
import com.exercise.calculator.model.OtherCalculation;
import com.exercise.calculator.model.SimpleCalculation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class CalculationController {

    private Data data = new Data(0, 0);
    private SimpleCalculation simpleCalculation = new SimpleCalculation();
    private OtherCalculation otherCalculation = new OtherCalculation();

    @GetMapping("/")
    public String inputData(Model model) {
        model.addAttribute("data", data);
        return "index";
    }

    @PostMapping(params = "add", value = "/")
    public String add(@ModelAttribute Data data, ModelMap map) {
        map.addAttribute("result", simpleCalculation.add(data.getA(), data.getB()));
        return "index";
    }

    @PostMapping(params = "sub", value = "/")
    public String sub(@ModelAttribute Data data, ModelMap map) {
        map.addAttribute("result", simpleCalculation.subtraction(data.getA(), data.getB()));
        return "index";
    }

    @PostMapping(params = "multi", value = "/")
    public String multi(@ModelAttribute Data data, ModelMap map) {
        map.addAttribute("result", simpleCalculation.multiplication(data.getA(), data.getB()));
        return "index";
    }

    @PostMapping(params = "div", value = "/")
    public String div(@ModelAttribute Data data, ModelMap map) {
        map.addAttribute("result", simpleCalculation.division(data.getA(), data.getB()));
        return "index";
    }

    @PostMapping(params = "percent", value = "/")
    public String percent(@ModelAttribute Data data, ModelMap map) {
        map.addAttribute("result", simpleCalculation.percentOf(data.getA(), data.getB()));
        return "index";
    }

    @PostMapping(params = "pow", value = "/")
    public String power(@ModelAttribute Data data, ModelMap map) {
        map.addAttribute("result", simpleCalculation.powerOf(data.getA(), data.getB()));
        return "index";
    }

    @PostMapping(params = "modulo", value = "/")
    public String modulo(@ModelAttribute Data data, ModelMap map) {
        map.addAttribute("result", simpleCalculation.modulo(data.getA(), data.getB()));
        return "index";
    }

    //-------------------------------------------------
    @PostMapping(params = "sqr", value = "/")
    public String sqr(@ModelAttribute Data data, ModelMap map) {
        map.addAttribute("result", otherCalculation.squareOf(data.getA()));
        return "index";
    }

    @PostMapping(params = "fac", value = "/")
    public String factorial(@ModelAttribute Data data, ModelMap map) {
        map.addAttribute("result", otherCalculation.factorial(data.getA()));
        return "index";
    }

    @PostMapping(params = "cub", value = "/")
    public String cubeOf(@ModelAttribute Data data, ModelMap map) {
        map.addAttribute("result", otherCalculation.cubeOf(data.getA()));
        return "index";
    }

    @PostMapping(params = "binary", value = "/")
    public String binary(@ModelAttribute Data data, ModelMap map) {
        map.addAttribute("result", otherCalculation.showAsBinary(data.getA()));
        return "index";
    }

    //-------------------------------------------------
    @PostMapping(params = "reset", value = "/")
    public String reset() {
        return "redirect:/";
    }
}
