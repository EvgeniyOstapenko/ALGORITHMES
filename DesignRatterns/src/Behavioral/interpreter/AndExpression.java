package Behavioral.interpreter;

public class AndExpression implements Expression {
    private Expression expression1;
    private Expression expression2;

    public AndExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String context) {
        System.out.println("--------");
        System.out.println(expression1.interpret(context));
        System.out.println(expression2.interpret(context));
        System.out.println("--------");

        return expression1.interpret(context) && expression2.interpret(context);
    }
}
