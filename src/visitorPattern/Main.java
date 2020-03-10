package visitorPattern;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();

        Operand o = new Operand(2);
        Operand o3 = new Operand(3);
        Operator oo = new Operator('+');
       client.useToken(o);
        client.useToken(o);
        client.useToken(oo);
        client.useToken(o3);
        client.useToken(oo);

    }


}
