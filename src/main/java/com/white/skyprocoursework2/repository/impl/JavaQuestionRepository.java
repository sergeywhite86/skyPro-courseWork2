package com.white.skyprocoursework2.repository.impl;

import com.white.skyprocoursework2.entity.Question;
import com.white.skyprocoursework2.repository.repo.InMemoryDb;
import com.white.skyprocoursework2.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class JavaQuestionRepository implements QuestionRepository {

    private final InMemoryDb inMemoryDb;

    @Override
    public Question add(String question, String answer) {
        Question inputQuestion = new Question(question, answer);
        inMemoryDb.JAVA_QUESTIONS.add(inputQuestion);
        return inputQuestion;
    }

    @Override
    public Question add(Question question) {
        inMemoryDb.JAVA_QUESTIONS.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        inMemoryDb.JAVA_QUESTIONS.remove(question);
        return question;
    }

    @Override
    public Question remove(String question, String answer) {
        Question inputQuestion = new Question(question, answer);
        inMemoryDb.JAVA_QUESTIONS.remove(inputQuestion);
        return inputQuestion;
    }

    @Override
    public Collection<Question> findAll() {
        return inMemoryDb.JAVA_QUESTIONS;
    }

    @Override
    public Question getRandomQuestion() {
        List<Question> questionList = new ArrayList<>(findAll());
        Collections.shuffle(questionList);
        return questionList.get(0);
    }
}
