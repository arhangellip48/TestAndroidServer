package ru.test.TestAndroidServer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/ansible")
public class AnsibleController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String GetAnsibleBaseInfo(){
        return "Ansible test base info ";
    }
}
