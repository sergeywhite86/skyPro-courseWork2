package com.white.skyprocoursework2.service.impl;

import com.white.skyprocoursework2.entity.Question;
import com.white.skyprocoursework2.repository.impl.MathQuestionRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collection;


import static com.white.skyprocoursework2.service.impl.constant.ConstantsForMathQuestionService.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MathQuestionServiceTest {
    @InjectMocks
    private MathQuestionService out;

    @Mock
    private MathQuestionRepository repository;

    @Test
    void add_When_Param_ObjectQuestion() {
        when(repository.add(MATH_QUESTION1)).thenReturn(MATH_QUESTION1);
        Question actual = out.add(MATH_QUESTION1);
        assertEquals(MATH_QUESTION1, actual);
    }

    @Test
    void add_When_Param_StringQuestion_StringAnswer() {
        when(repository.add(MATH_QUESTION1.getQuestion(), MATH_QUESTION1.getAnswer())).thenReturn(MATH_QUESTION1);
        Question actual = out.add(MATH_QUESTION1.getQuestion(), MATH_QUESTION1.getAnswer());
        assertEquals(MATH_QUESTION1, actual);
    }

    @Test
    void remove_When_Param_ObjectQuestion() {
        when(repository.remove(MATH_QUESTION1)).thenReturn(MATH_QUESTION1);
        Question actual = out.remove(MATH_QUESTION1);
        assertEquals(MATH_QUESTION1, actual);
    }

    @Test
    void remove_When_Param_StringQuestion_StringAnswer() {
        when(repository.remove(MATH_QUESTION1.getQuestion(), MATH_QUESTION1.getAnswer())).thenReturn(MATH_QUESTION1);
        Question actual = out.remove(MATH_QUESTION1.getQuestion(), MATH_QUESTION1.getAnswer());
        assertEquals(MATH_QUESTION1, actual);
    }

    @Test
    void getAll() {
        when(repository.findAll()).thenReturn(MATH_QUESTIONS);
        Collection<Question> actual = out.getAll();
        assertEquals(MATH_QUESTIONS, actual);
    }

    @Test
    void getRandomQuestion() {
        when(repository.getRandomQuestion()).thenReturn(MATH_QUESTION3);
        Question actual = out.getRandomQuestion();
        assertEquals(MATH_QUESTION3, actual);
    }
}