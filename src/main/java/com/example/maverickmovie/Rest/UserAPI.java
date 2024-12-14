package com.example.maverickmovie.Rest;

import com.example.maverickmovie.Model.User;
import com.example.maverickmovie.Service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Slf4j
@RequestMapping("/api/users")
public class UserAPI {

    @Autowired
    private UserService userService;

    @GetMapping("/getAllUsers")
    public ResponseEntity<?> doGetAllUsers() {
        Map<String, Object> result = new HashMap<>();

        try {
            List<User> data = userService.getAllUsers();
            result.put("success", true);
            result.put("message", "Call api doGetAllUsers successfully");
            result.put("data", data);
        } catch (Exception e) {
            result.put("success", false);
            result.put("message", "Call api doGetAllUsers fail");
            result.put("data", null);
            log.error("Error: ", e);
        }

        return ResponseEntity.ok(result);
    }

    @GetMapping("/getAllUsersByEmail")
    public ResponseEntity<?> doGetAllUsersByEmail(@RequestParam(value = "email", required = false) String email) {
        Map<String, Object> result = new HashMap<>();

        try {
            List<User> data = userService.getAllUsersByEmail(email);
            result.put("success", true);
            result.put("message", "Call api doGetAllUsersByEmail successfully");
            result.put("data", data);
        } catch (Exception e) {
            result.put("success", false);
            result.put("message", "Call api doGetAllUsersByEmail fail");
            result.put("data", null);
            log.error("Error: ", e);
        }

        return ResponseEntity.ok(result);
    }
}
