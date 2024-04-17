package com.c9.riwayatTransaksi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/Transaction")
    public String hello() {
        return "Hello, Transaction!";
    }


}
