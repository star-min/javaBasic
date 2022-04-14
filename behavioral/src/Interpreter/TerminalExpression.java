package Interpreter;

public class TerminalExpression implements Expression {
    String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpreter(String con) {

        return con.contains(data);
    }
}