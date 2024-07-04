package com.white.skyprocoursework2.service;

import com.white.skyprocoursework2.entity.Question;

import java.util.Collection;

public interface ExaminerService {
   Collection<Question> getQuestions(int amount);
}
