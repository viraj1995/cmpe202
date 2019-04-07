/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

/**
 *  Main App Class for Displaying Screen.
 */
public class App {

    private Screen screen;
    private CreditCardNum num;
    private CreditCardExp exp;
    private CreditCardCVC cvc;
    private int count;

    public App() {

        screen = new Screen();
        num = new CreditCardNum();
        exp = new CreditCardExp();
        cvc = new CreditCardCVC();

        screen.addSubComponent(num);
        screen.addSubComponent(exp);
        screen.addSubComponent(cvc);
        num.wrapDecorator(new CreditCardNumDecorator());
        exp.wrapDecorator(new CreditCardExpDecorator());

        count = 0;

    }

    public String display() {
        String output = "";
        output += "========================================\n";
        output += screen.name() + "\n";
        output += "========================================\n";
        output += "\n\n\n\n";
        output += screen.display() + "\n";
        output += "\n\n\n\n";
        output += "========================================\n";
        return output;
    }

    public void key(String ch) {
        if ((ch.equals("x") || ch.equals("X")) && count>0 && count>0 && ch.length() == 1){
            screen.key(ch, count);
            count --;
        }
        else if((ch.length() == 1 && ch != "x" && ch != "X" && (int)ch.charAt(0)>=48 && (int)ch.charAt(0)<=57 && count < 23){
        count++;
        screen.key(ch, count);
    }
    }

}

