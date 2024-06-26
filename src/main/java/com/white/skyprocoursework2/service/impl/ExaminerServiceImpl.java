package com.white.skyprocoursework2.service.impl;

import com.white.skyprocoursework2.entity.Question;
import com.white.skyprocoursework2.exception.AmountException;
import com.white.skyprocoursework2.service.ExaminerService;
import com.white.skyprocoursework2.service.QuestionService;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class ExaminerServiceImpl implements ExaminerService {

    @Qualifier("javaQuestionService")
    private final QuestionService javaQuestionService;

    @Qualifier("mathQuestionService")
    private final QuestionService mathQuestionService;

    private final Random random = new Random();
    @Setter
    @Getter
    private List<Question> data;

    @PostConstruct
    public void init() {
        data = new ArrayList<>(javaQuestionService.getAll());
        data.addAll(mathQuestionService.getAll());
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        if (amount > data.size()) throw new AmountException();
        Collections.shuffle(data);
        Set<Question> questions = new HashSet<>();
        while (questions.size() != amount) {
            int index = random.nextInt(amount);
            questions.add(data.get(index));
        }
        return questions;
    }
}
