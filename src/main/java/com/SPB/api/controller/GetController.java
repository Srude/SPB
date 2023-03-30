package com.SPB.api.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class GetController {
    @GetMapping("/variable/{variable}")
    public String getVariable(@PathVariable String variable){
        return variable;
    }
    //http://localhost:8088/api/variable/test

    @GetMapping("/request1")
    public String getRequestParam1(
            @RequestParam String name, @RequestParam String email, @RequestParam String organization){

        return name + " " + email + " " + organization;
    }
    //http://localhost:8088/api/request1?name=v&email=b&organization=n

    @GetMapping("/request2")
    public String getRequestParam2(@RequestParam Map<String,String> param){
        StringBuilder builder = new StringBuilder();
        param.entrySet().forEach(map->{
            builder.append(map.getKey() + " : " + map.getValue() + "\n");
        });
        return builder.toString();
    }
    //http://localhost:8088/api/request2?key1=v&key2=b

}

















//public class GetController {
//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
//    public String getHello(){
//        return "Hello";
//    }
//}
