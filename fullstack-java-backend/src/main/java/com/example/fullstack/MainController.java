package com.example.fullstack; // ✅ Ensure this matches your folder structure

import org.springframework.web.bind.annotation.*;

@RestController // ✅ Marks this class as a REST API controller
@CrossOrigin(origins = "*") // ✅ Allows frontend requests from any origin
public class MainController {

    // ✅ Default Route - Confirms backend is running
    @GetMapping("/")
    public String home() {
        return "🚀 Java Backend is Running!";
    }

    // ✅ Sample API Endpoint - Returns a simple message
    @GetMapping("/data")
    public String getData() {
        return "Hello SAM from Java Backend!";
    }
}
