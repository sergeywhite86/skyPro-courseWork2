package com.white.skyprocoursework2.service.impl.constant;

import com.white.skyprocoursework2.entity.Question;

import java.util.Collection;
import java.util.List;

import static com.white.skyprocoursework2.service.impl.constant.ConstantsForJavaQuestionService.*;
import static com.white.skyprocoursework2.service.impl.constant.ConstantsForMathQuestionService.*;

public class ConstantsForExaminerQuestionService {
    public static final Collection<Question> EXAM_QUESTIONS_LIST =
            List.of(JAVA_QUESTION1, JAVA_QUESTION2, JAVA_QUESTION3,MATH_QUESTION1, MATH_QUESTION2, MATH_QUESTION3);

}
