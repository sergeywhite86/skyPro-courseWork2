package com.white.skyprocoursework2.service.impl.constant;

import com.white.skyprocoursework2.entity.Question;


import java.util.Collection;
import java.util.List;

public class ConstantsForJavaQuestionService {

    public static final Question JAVA_QUESTION1 =
            new Question("От какого класса наследуются все классы java?", "Object");
    public static final Question JAVA_QUESTION2 =
            new Question("Метод,который является входной точкой в приложение?", "main");
    public static final Question JAVA_QUESTION3 = new Question("Самый популярный класс java?", "String");

    public static final Collection<Question> JAVA_QUESTIONS_LIST =
            List.of(JAVA_QUESTION1, JAVA_QUESTION2, JAVA_QUESTION3);

}
