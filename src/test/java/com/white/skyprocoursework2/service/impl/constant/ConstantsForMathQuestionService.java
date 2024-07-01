package com.white.skyprocoursework2.service.impl.constant;

import com.white.skyprocoursework2.entity.Question;



import java.util.Set;

public class ConstantsForMathQuestionService {
    public static final Question MATH_QUESTION1 = new Question("10+11", "21");
    public static final Question MATH_QUESTION2 = new Question("8+10", "18");
    public static final Question MATH_QUESTION3 = new Question("8+7", "15");

    public static final Set<Question> MATH_QUESTIONS =
            Set.of(MATH_QUESTION1, MATH_QUESTION2, MATH_QUESTION3);
}
