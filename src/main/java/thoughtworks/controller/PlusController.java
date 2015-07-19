/*
 * Copyright 2015 ThoughtWorks Inc.
 *
 * MIT
 */

package thoughtworks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import thoughtworks.model.CalculateForm;
import thoughtworks.domain.Calculator;
import thoughtworks.domain.Plus;

@Controller
@RequestMapping(value = "/")
public class PlusController {

    @RequestMapping(value = "/plus", method = RequestMethod.POST)
    public String plusCalculate(@ModelAttribute("SpringWeb") CalculateForm calculateForm,
                       ModelMap model) {
        Calculator plusCalculator = new Plus();
        model.addAttribute("firstNumber", calculateForm.getFirstNumber());
        model.addAttribute("secondNumber", calculateForm.getSecondNumber());
        model.addAttribute("result", plusCalculator.calculate(
                calculateForm.getFirstNumber(),
                calculateForm.getSecondNumber()
        ));
        model.addAttribute("calculateForm", calculateForm);
        return "plus";
    }

    @RequestMapping(value = "/plus", method = RequestMethod.GET)
    public String plusPage(Model model) {

        model.addAttribute("calculateForm", new CalculateForm());
        return "plus";
    }

}
