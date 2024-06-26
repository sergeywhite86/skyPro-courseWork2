package com.white.skyprocoursework2.controller;

import com.white.skyprocoursework2.entity.Question;
import com.white.skyprocoursework2.service.impl.ExaminerServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequiredArgsConstructor
public class ExamController {

    private final ExaminerServiceImpl examinerService;

    @GetMapping("/get/{amount}")
    public Collection<Question> getQuestions(@PathVariable int amount){
       return   examinerService.getQuestions(amount);
    }
}
