package com.schools.blackjackstat.demo.controller;

import com.schools.blackjackstat.demo.model.StrategyTable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {
    @RequestMapping(path ="/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(path = "/stratTable", method = RequestMethod.GET)
    public String stratPage(Model model) {
        StrategyTable playStrategy = new StrategyTable();
        playStrategy.setBasicTable();
        playStrategy.setAltTable();
        model.addAttribute("table", playStrategy);
        return "stratTable";
    }

    @RequestMapping(path = "/index", method = RequestMethod.POST)
    public String setStrat() {
        return "redirect:/stratTable";
    }
}
