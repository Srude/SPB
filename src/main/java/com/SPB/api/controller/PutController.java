package com.SPB.api.controller;

import com.SPB.api.dto.MemberDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("put-api")
public class PutController {
    @PostMapping(value = "/member")
    public String postMember(@RequestBody Map<String, Object> postData){
        StringBuilder sb = new StringBuilder();

        postData.entrySet().forEach(map ->{
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });
        return sb.toString();
    }

    @PutMapping("/member1")
    public String postMemberDTO1(@RequestBody MemberDTO memberDTO){
        return memberDTO.toString();
    }//http://localhost:8088/put-api/member1
//    {
//        "name" : "v1",
//        "email" : "v2",
//        "organization" : "v3"
//    }

    @PutMapping("/member2")
    public MemberDTO postMemberDTO2(@RequestBody MemberDTO memberDTO){
        return memberDTO;
    }//http://localhost:8088/put-api/member2

    @PutMapping("/member3")
    public ResponseEntity<MemberDTO> postMemberDTO3(@RequestBody MemberDTO memberDTO){
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(memberDTO);
    }


}
