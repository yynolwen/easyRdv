package fr.ospiea.easyrdv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by YongYanOspiea on 16/08/2016.
 */

@Controller
@EnableWebMvc
public class AppointmentReceiver {

    @RequestMapping(value ="/callACandidate",headers="Accept=*/*",  produces="application/json")
    //public @ResponseBody CallResult callACandidate(@RequestParam(value="name", required=true) String name, @RequestParam(value="tel", required=true) String tel) {
    public @ResponseBody CallResult callACandidate() {

        CallResult callResult = new CallResult();
        callResult.setName("name");
        callResult.setTel("tel");

        //ici on fait les appels.....
        boolean result = true;// callService.callCandidate(name,tel);



        callResult.setRdvPrise(result);

        return callResult;
    }

}
