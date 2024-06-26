package com.white.skyprocoursework2.service.impl;

import com.white.skyprocoursework2.entity.Question;
import com.white.skyprocoursework2.repository.impl.JavaQuestionRepository;
import com.white.skyprocoursework2.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class JavaQuestionService implements QuestionService {

    private final JavaQuestionRepository repository;

    @Override
    public Question add(String question, String answer) {
        return repository.add(question, answer);
    }

    @Override
    public Question add(Question question) {
        return repository.add(question);
    }

    @Override
    public Question remove(Question question) {
        return repository.remove(question);
    }

    @Override
    public Question remove(String question, String answer) {
        return repository.remove(question, answer);
    }

    @Override
    public Collection<Question> getAll() {
        return repository.findAll();
    }

    @Override
    public Question getRandomQuestion() {
        return repository.getRandomQuestion();
    }
}
