package com.white.skyprocoursework2.repository.repo;

import com.white.skyprocoursework2.entity.Question;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class InMemoryDb {

    public final Set<Question> JAVA_QUESTIONS = new HashSet<>();
    public final Set<Question> MATH_QUESTIONS = new HashSet<>();

    @PostConstruct
    public void init() {
        JAVA_QUESTIONS.add(new Question("От какого класса наследуются все классы java?", "Object"));
        JAVA_QUESTIONS.add(new Question("Метод,который является входной точкой в приложение?", "main"));
        JAVA_QUESTIONS.add(new Question("Самый популярный класс java?", "String"));
        JAVA_QUESTIONS.add(new Question("Модификатор доступа с минимальной областью видимости?", "private"));
        JAVA_QUESTIONS.add(new Question("Модификатор доступа с максимальной областью видимости?", "public"));
        JAVA_QUESTIONS.add(new Question("Какое ключевой слово используется для вызова конструктора?", "new"));
        JAVA_QUESTIONS.add(new Question("Какое ключевое слово используется для реализации интерфейса?", "implement"));
        JAVA_QUESTIONS.add(new Question("Какое ключевой слово используется для наследования класса?", "extend"));
        JAVA_QUESTIONS.add(new Question("Поддерживает ли java множественное наследование?", "нет"));
        JAVA_QUESTIONS.add(new Question("Как называется память в которой хранятся объекты?", "heap"));

        MATH_QUESTIONS.add(new Question("10+10", "20"));
        MATH_QUESTIONS.add(new Question("25+10", "35"));
        MATH_QUESTIONS.add(new Question("1+10", "11"));
        MATH_QUESTIONS.add(new Question("99+1", "100"));
        MATH_QUESTIONS.add(new Question("100+10", "110"));
        MATH_QUESTIONS.add(new Question("11+11", "22"));
        MATH_QUESTIONS.add(new Question("88+10", "98"));
        MATH_QUESTIONS.add(new Question("77+1", "78"));
        MATH_QUESTIONS.add(new Question("13+101", "114"));
        MATH_QUESTIONS.add(new Question("8+15", "23"));
    }
}
