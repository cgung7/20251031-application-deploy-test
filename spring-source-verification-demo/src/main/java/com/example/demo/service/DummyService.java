package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DummyService {

    public void checkNull() {
        String str = null;

        if (str != null) {
            System.out.println(String.valueOf(str));
        } else {
            System.out.println("str is null");
        }

    }
}
