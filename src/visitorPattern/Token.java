package visitorPattern;

public abstract class Token {

    private Visitor visitor;

    public abstract void accept(Visitor visitor);
}
