package com.example.restart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.restart.mybatis.bean.JsonResult;
import com.example.restart.mybatis.bean.User;
import com.example.restart.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "user/{id}")
    public ResponseEntity<JsonResult> getUserById(@PathVariable(value = "id")Integer id){
        JsonResult jsonResult = new JsonResult();
        try{
            User user = userService.getUserById(id);
            jsonResult.setResult(user);
            jsonResult.setStatus("ok");
        }
        catch(Exception e){
            jsonResult.setResult(e.getClass().getName() + ":" + e.getMessage());
            jsonResult.setStatus("error");
            e.printStackTrace();
        }
        return ResponseEntity.ok(jsonResult);
    }

    @GetMapping(path = "users")
    public ResponseEntity<JsonResult> getUserList (){
        JsonResult jsonResult = new JsonResult();
        try{
            List<User> userList = userService.getUserList();
            jsonResult.setResult(userList);
            jsonResult.setStatus("ok");
        }
        catch(Exception e){
            jsonResult.setResult(e.getClass().getName() + ":" + e.getMessage());
            jsonResult.setStatus("error");
            e.printStackTrace();
        }
        return ResponseEntity.ok(jsonResult);
    }

    @PostMapping(path = "user")
    public ResponseEntity<JsonResult> add (@RequestBody User user){
        JsonResult jsonResult = new JsonResult();

        try {
            int orderId = userService.add(user);
            if (orderId < 0) {
                jsonResult.setResult(orderId);
                jsonResult.setStatus("fail");
            } else {
                jsonResult.setResult(orderId);
                jsonResult.setStatus("ok");
            }
        } catch (Exception e) {
            jsonResult.setResult(e.getClass().getName() + ":" + e.getMessage());
            jsonResult.setStatus("error");

            e.printStackTrace();
        }
        return ResponseEntity.ok(jsonResult);

    }

    @DeleteMapping(path = "user/{id}")

    public ResponseEntity<JsonResult> delete (@PathVariable(value = "id") Integer id){
        JsonResult jsonResult = new JsonResult();
        try {
            int ret = userService.delete(id);
            if (ret < 0) {
                jsonResult.setResult(ret);
                jsonResult.setStatus("fail");
            } else {
                jsonResult.setResult(ret);
                jsonResult.setStatus("ok");
            }
        } catch (Exception e) {
            jsonResult.setResult(e.getClass().getName() + ":" + e.getMessage());
            jsonResult.setStatus("error");

            e.printStackTrace();
        }
        return ResponseEntity.ok(jsonResult);
    }

    @PutMapping(path = "user/{id}")

    public ResponseEntity<JsonResult> update (@PathVariable("id") Integer id, @RequestBody User user){
        JsonResult jsonResult = new JsonResult();
        try {
            int ret = userService.update(id, user);
            if (ret < 0) {
                jsonResult.setResult(ret);
                jsonResult.setStatus("fail");
            } else {
                jsonResult.setResult(ret);
                jsonResult.setStatus("ok");
            }
        } catch (Exception e) {
            jsonResult.setResult(e.getClass().getName() + ":" + e.getMessage());
            jsonResult.setStatus("error");

            e.printStackTrace();
        }
        return ResponseEntity.ok(jsonResult);
    }


}
