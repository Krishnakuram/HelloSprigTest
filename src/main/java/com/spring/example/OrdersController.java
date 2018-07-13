package com.spring.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OrdersController {


    @RequestMapping(value = "/Orders", method = RequestMethod.GET)
    public String Orders() {
        System.out.println("inside Orders Controller");
        return "Orders";

    }


}


