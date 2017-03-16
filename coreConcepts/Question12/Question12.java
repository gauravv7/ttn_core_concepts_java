package coreConcepts.Question12;

/**
 * Created by gaurav on 16/3/17.
 */
public class Question12 {
    public static void main(String[] args) {

        SBI sbi=new SBI(7.5f, 220, 1100, 220);
        BOI boi=new BOI(6.5f, 220, 110, 220);
        ICICI icici=new ICICI(5.5f, 220, 110, 220);

        System.out.println(sbi.getDetails());
        System.out.println(boi.getDetails());
        System.out.println(icici.getDetails());
    }
}

