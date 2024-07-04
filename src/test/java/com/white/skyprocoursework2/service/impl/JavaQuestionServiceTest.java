package com.white.skyprocoursework2.service.impl;

import com.white.skyprocoursework2.entity.Question;
import com.white.skyprocoursework2.repository.impl.JavaQuestionRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collection;


import static com.white.skyprocoursework2.service.impl.constant.ConstantsForJavaQuestionService.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class JavaQuestionServiceTest {
    @InjectMocks
    private JavaQuestionService out;

    @Mock
    private JavaQuestionRepository repository;

    @Test
    void add_When_Param_ObjectQuestion() {
        when(repository.add(JAVA_QUESTION1)).thenReturn(JAVA_QUESTION1);
        Question actual = out.add(JAVA_QUESTION1);
        assertEquals(JAVA_QUESTION1, actual);
    }

    @Test
    void add_When_Param_StringQuestion_StringAnswer() {
        when(repository.add(JAVA_QUESTION1.getQuestion(), JAVA_QUESTION1.getAnswer())).thenReturn(JAVA_QUESTION1);
        Question actual = out.add(JAVA_QUESTION1.getQuestion(), JAVA_QUESTION1.getAnswer());
        assertEquals(JAVA_QUESTION1, actual);
    }

    @Test
    void remove_When_Param_ObjectQuestion() {
        when(repository.remove(JAVA_QUESTION1)).thenReturn(JAVA_QUESTION1);
        Question actual = out.remove(JAVA_QUESTION1);
        assertEquals(JAVA_QUESTION1, actual);
    }

    @Test
    void remove_When_Param_StringQuestion_StringAnswer() {
        when(repository.remove(JAVA_QUESTION1.getQuestion(), JAVA_QUESTION1.getAnswer())).thenReturn(JAVA_QUESTION1);
        Question actual = out.remove(JAVA_QUESTION1.getQuestion(), JAVA_QUESTION1.getAnswer());
        assertEquals(JAVA_QUESTION1, actual);
    }

    @Test
    void getAll() {
        when(repository.findAll()).thenReturn(JAVA_QUESTIONS);
        Collection<Question> actual = out.getAll();
        assertEquals(JAVA_QUESTIONS, actual);
    }

    @Test
    void getRandomQuestion() {
        when(repository.getRandomQuestion()).thenReturn(JAVA_QUESTION3);
        Question actual = out.getRandomQuestion();
        assertEquals(JAVA_QUESTION3, actual);
    }
}