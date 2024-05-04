package com.example.demo.controller;

import com.example.demo.Vo.ResultVo;
import com.example.demo.service.HWService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HWController {
    HWService HWServiceInstance;

    @GetMapping("/helloWorld")
    public ResultVo<String> getHelloWorld(@RequestParam("username") String username, @RequestParam("password") String password) {
        String res = HWServiceInstance.helloWorld(username, password);
        if (res == null)
            return ResultVo.buildFailure("Incorrect Username or Password!");
        else
            return ResultVo.buildSuccess(res);
    }
}
