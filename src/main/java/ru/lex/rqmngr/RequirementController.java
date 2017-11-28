package ru.lex.rqmngr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.lex.rqmngr.bo.Requirement;

/**
 * @author KuznetsovAN
 */

@Controller
public class RequirementController {

    @RequestMapping(value = "/requirement", method = RequestMethod.GET)
    public ModelAndView requirement() {
        return new ModelAndView("requirement", "command", new Requirement());
    }

    @RequestMapping(value = "/addRequirement", method = RequestMethod.POST)
    public String addRequirement(@ModelAttribute("SpringWeb")Requirement requirement, ModelMap model) {
        model.addAttribute("oid", requirement.getOid());
        model.addAttribute("name", requirement.getName());
        model.addAttribute("description", requirement.getDescription());
        return "result";
    }

}
