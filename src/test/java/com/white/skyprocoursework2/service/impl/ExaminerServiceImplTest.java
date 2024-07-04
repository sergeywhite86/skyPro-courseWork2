package com.white.skyprocoursework2.service.impl;

import com.white.skyprocoursework2.entity.Question;

import com.white.skyprocoursework2.exception.AmountException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static com.white.skyprocoursework2.service.impl.constant.ConstantsForExaminerQuestionService.EXAM_QUESTIONS_LIST;
import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {

    @InjectMocks
    private  ExaminerServiceImpl out;

    @BeforeEach
    public void initDB(){
        List<Question> questions = new ArrayList<>(EXAM_QUESTIONS_LIST);
        out.setData(questions);
    }

    @Test
    void getQuestions() {
        int expected = EXAM_QUESTIONS_LIST.size();
        Collection<Question> questionList = out.getQuestions(6);
        int actual = questionList.size();
        assertEquals(expected, actual);
    }

    @Test
    void getQuestions_When_Then_Param_MoreAmount() {
        assertThrows(AmountException.class, () -> out.getQuestions(7));
    }
}