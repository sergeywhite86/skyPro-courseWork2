package com.white.skyprocoursework2.repository.impl;

import com.white.skyprocoursework2.entity.Question;
import com.white.skyprocoursework2.repository.repo.InMemoryDb;
import com.white.skyprocoursework2.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;


import java.util.*;

@Repository
@RequiredArgsConstructor
public class JavaQuestionRepository implements QuestionRepository {

    private final InMemoryDb inMemoryDb;

    @Override
    public Question add(String question, String answer) {
        Question inputQuestion = new Question(question, answer);
        inMemoryDb.getJavaQuestions().add(inputQuestion);
        return inputQuestion;
    }

    @Override
    public Question add(Question question) {
        inMemoryDb.getJavaQuestions().add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        inMemoryDb.getJavaQuestions().remove(question);
        return question;
    }

    @Override
    public Question remove(String question, String answer) {
        Question inputQuestion = new Question(question, answer);
        inMemoryDb.getJavaQuestions().remove(inputQuestion);
        return inputQuestion;
    }

    @Override
    public List<Question> findAll() {
        return inMemoryDb.getJavaQuestions();
    }

    @Override
    public Question getRandomQuestion() {
        Random random = new Random();
        return findAll().get(random.nextInt(findAll().size()));
    }
}
