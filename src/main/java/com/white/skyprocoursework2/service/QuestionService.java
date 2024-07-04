package com.white.skyprocoursework2.service;

import com.white.skyprocoursework2.entity.Question;

import java.util.Collection;

public interface QuestionService {
    Question add(String question, String answer);

    Question add(Question question);

    Question remove(Question question);

    Question remove(String question, String answer);

    Collection<Question> getAll();

    Question getRandomQuestion();

}
