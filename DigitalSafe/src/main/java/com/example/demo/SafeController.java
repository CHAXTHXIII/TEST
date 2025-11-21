package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/safe")
public class SafeController {

    private final DigitalSafe safe;

    public SafeController() {
        this.safe = new DigitalSafe("Digital Safe Owner");
    }

    @GetMapping("/owner")
    public String getOwner() {
        return safe.getOwnerName();
    }

    @GetMapping("/balance")
    public double getBalance() {
        return safe.getBalance();
    }

    @PostMapping("/deposit")
    public double deposit(@RequestParam("amount") double amount) {
        return safe.deposit(amount);
    }
}

