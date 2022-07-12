package com.datacloud.DaCu.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BaseController {

    @GetMapping("/")
    public ResponseEntity<List<String>> getBankList(@RequestParam(name = "name", required = false) String name) {
        try {
            List<String> stringArrayList = new ArrayList<>();
            if(!stringArrayList.contains(name))
                stringArrayList.add(name);
            if (stringArrayList.isEmpty())
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            return new ResponseEntity<>(stringArrayList, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
