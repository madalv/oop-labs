package lab4;


import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> oneExpression = ExpressionReader.expressionRead("C:\\Users\\Vlada\\IdeaProjects\\oop-labs\\src\\lab4\\one_expression.txt");
        List<String> threeExpressions = ExpressionReader.expressionRead("C:\\Users\\Vlada\\IdeaProjects\\oop-labs\\src\\lab4\\three_expressions.txt");

        System.out.println(ExpressionChecker.checkParanthethis(oneExpression.get(0)));
        System.out.println(ExpressionChecker.checkParanthethis(threeExpressions.get(0)));
        System.out.println(ExpressionChecker.checkParanthethis(threeExpressions.get(1)));
        System.out.println(ExpressionChecker.checkParanthethis(threeExpressions.get(2)));
    }
}
