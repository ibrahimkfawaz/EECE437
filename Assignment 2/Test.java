/**
 * Created by Hasan Fakih on 5/6/2017.
 */
public class Test {
    public static void main(String args[]){
        TADouble d = new TADouble(3.3);
        TACeiling c = new TACeiling(d);
        c.list();
        c.evaluate();
        c.printstate();
    }
}
