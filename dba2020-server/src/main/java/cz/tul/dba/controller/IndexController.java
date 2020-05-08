package cz.tul.dba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.annotations.ApiIgnore;

@Controller
public class IndexController {

    @ApiIgnore
    @RequestMapping(path = "/index", method = RequestMethod.GET)
    public String getIndex(ModelMap modelMap) {

        return "index";
    }
}