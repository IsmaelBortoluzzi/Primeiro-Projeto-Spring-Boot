package com.cursojava.cursojava.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/RUNONLYONCE")
public class PopulateDB {

//    @GetMapping
//    public ResponseEntity.BodyBuilder populate() {
//        TestConfig tc = new TestConfig();
//
//        try
//            { tc.run(); }
//        catch (Exception e)
//            { return ResponseEntity.status(400); }
//
//        return ResponseEntity.status(200);
//
//    }

}
