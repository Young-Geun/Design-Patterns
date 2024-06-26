package org.example.designpatterns._03_behavioral._15_interpreter._02_after;

import java.util.Map;

public interface PostfixExpression {

    int interpret(Map<Character, Integer> context);

}
