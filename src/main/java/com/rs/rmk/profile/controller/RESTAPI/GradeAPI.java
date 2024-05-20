package com.rs.rmk.profile.controller.RESTAPI;

import com.rs.rmk.profile.model.Grade;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class GradeAPI {

    Map<String, ?> myGrade;

    @PostMapping("/postGrade")
    boolean postGrade(@RequestBody Map<String, ?> myGrade) {
        this.myGrade = myGrade;
        return true;
    }
    @GetMapping("/getGrade")
    Map<String, ?> getGrade() {
        return myGrade;
    }
}
