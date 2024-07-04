package com.white.skyprocoursework2.controller;

import com.white.skyprocoursework2.entity.Question;
import com.white.skyprocoursework2.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequiredArgsConstructor
@RequestMapping("/math")
public class MathQuestionController {

    @Qualifier("mathQuestionService")
    private final QuestionService service;

    @GetMapping
    public Collection<Question> getQuestions() {
        return service.getAll();
    }

    @GetMapping("/get")
    public Question getRandomQuestions() {
        return service.getRandomQuestion();
    }

    @PutMapping("/add")
    public Question addQuestion(@RequestParam String question, @RequestParam String answer) {
        return service.add(question, answer);
    }

    @DeleteMapping("/remove")
    public Question removeQuestion(@RequestParam String question, @RequestParam String answer) {
        return service.remove(question, answer);
    }
}
