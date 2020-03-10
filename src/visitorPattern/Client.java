package visitorPattern;

public class Client {


    Visitor visitor = new Visitor();

    public void useToken(Token t){
       t.accept(visitor);
    }
}

