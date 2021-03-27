package io.ngatale.employee_authentication.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/authenticate/employee/")
public class Authenticate {

    @RequestMapping( method = RequestMethod.GET, value = "hello")
    public String hello(){
        return "HelloWorld";
    }

    @RequestMapping(method = RequestMethod.GET, value = "admin")
    public String admin(){
        return "Admin";
    }

    @RequestMapping(method = RequestMethod.GET, value = "employee")
    public String employee(){
        return "employee";
    }
}
