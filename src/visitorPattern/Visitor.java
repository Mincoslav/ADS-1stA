package visitorPattern;


public class Visitor {

    PostfixEvaluation evaluation = new PostfixEvaluation();
    StackFromList stack = new StackFromList();


    public void visit(Operand operand){
        pushOperand(operand);

    }

    public void visit(Operator operator){
        performOperation(operator);
    }

    public void pushOperand(Operand operand){
        if (stack.size() <= 2){
            stack.push(operand);
        }
        else
            System.out.println("Invalid token");
    }

    public void performOperation(Operator operator){
        if (stack.size() == 2){
            Operand o =(Operand) stack.pop();
            System.out.println(o.getValue());
            int val1 = o.getValue();
            Operand o2 =(Operand) stack.pop();
            int val2 = o2.getValue();
            char c = operator.getType();

            switch(c)
            {
                case '+':
                    Operand operand = new Operand(val2+val1);
                    stack.push(operand);
                    System.out.print(val1+"+"+val2+"=" );
                    System.out.print(val2+val1);
                    System.out.println("\n");
                    break;

                case '-':
                    Operand operand2 = new Operand(val2-val1);
                    stack.push(operand2);
                    System.out.print(val1+"-"+val2+"=" );
                    System.out.print(val2-val1);
                    System.out.println("\n");
                    break;

                case '/':
                    Operand operand3 = new Operand(val2/val1);
                    stack.push(operand3);
                    System.out.print(val1+"/"+val2+"=" );
                    System.out.print(val2/val1);
                    System.out.println("\n");
                    break;

                case '*':
                    Operand operand4 = new Operand(val2*val1);
                    stack.push(operand4);
                    System.out.print(val1+"*"+val2+"=" );
                    System.out.print(val2*val1);
                    System.out.println("\n");
                    break;
            }
        }
    }
}
