package com.white.skyprocoursework2.repository.repo;

import com.white.skyprocoursework2.entity.Question;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;


@Getter
@Repository
public class InMemoryDb {

    private final Set<Question> javaQuestions = new HashSet<>();
    private final Set<Question> mathQuestions = new HashSet<>();

    @PostConstruct
    public void init() {
        javaQuestions.add(new Question("От какого класса наследуются все классы java?", "Object"));
        javaQuestions.add(new Question("Метод,который является входной точкой в приложение?", "main"));
        javaQuestions.add(new Question("Самый популярный класс java?", "String"));
        javaQuestions.add(new Question("Модификатор доступа с минимальной областью видимости?", "private"));
        javaQuestions.add(new Question("Модификатор доступа с максимальной областью видимости?", "public"));
        javaQuestions.add(new Question("Какое ключевой слово используется для вызова конструктора?", "new"));
        javaQuestions.add(new Question("Какое ключевое слово используется для реализации интерфейса?", "implement"));
        javaQuestions.add(new Question("Какое ключевой слово используется для наследования класса?", "extend"));
        javaQuestions.add(new Question("Поддерживает ли java множественное наследование?", "нет"));
        javaQuestions.add(new Question("Как называется память в которой хранятся объекты?", "heap"));

        mathQuestions.add(new Question("10+10", "20"));
        mathQuestions.add(new Question("25+10", "35"));
        mathQuestions.add(new Question("1+10", "11"));
        mathQuestions.add(new Question("99+1", "100"));
        mathQuestions.add(new Question("100+10", "110"));
        mathQuestions.add(new Question("11+11", "22"));
        mathQuestions.add(new Question("88+10", "98"));
        mathQuestions.add(new Question("77+1", "78"));
        mathQuestions.add(new Question("13+101", "114"));
        mathQuestions.add(new Question("8+15", "23"));
    }
}
