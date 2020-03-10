package visitorPattern;

public class Operator extends Token {

    private char type;

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public Operator(char type) {
        this.type = type;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
