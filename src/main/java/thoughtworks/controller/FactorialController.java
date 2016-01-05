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
import thoughtworks.domain.Factorial;
import thoughtworks.model.CalculateForm;

@Controller
@RequestMapping(value = "/")
public class FactorialController {

    /**
     * 计算
     * @param calculateForm form
     * @param model 模型
     * @return
     */
    @RequestMapping(value = "/factorial", method = RequestMethod.POST)
    public String plusCalculate(@ModelAttribute("SpringWeb") CalculateForm calculateForm,
                                ModelMap model) {
        Factorial factorial = new Factorial();
        model.addAttribute("firstNumber", calculateForm.getFirstNumber());
        model.addAttribute("result", factorial.factorialSum(calculateForm.getFirstNumber()));
        model.addAttribute("calculateForm", calculateForm);
        return "factorial";
    }

    @RequestMapping(value = "/factorial", method = RequestMethod.GET)
    public String plusPage(Model model) {

        model.addAttribute("calculateForm", new CalculateForm());
        return "factorial";
    }



}
