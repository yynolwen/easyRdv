package fr.ospiea.easyrdv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by YongYanOspiea on 16/08/2016.
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index() {

        return "index";
    }
}
