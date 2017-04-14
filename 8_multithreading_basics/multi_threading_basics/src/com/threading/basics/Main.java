package com.threading.basics;

import com.threading.basics.q1.OddEvenWorker;
import com.threading.basics.q2.PrimeNonPrimeWorker;
import com.threading.basics.q4.ReverseHello;
import com.threading.basics.q7.PubSub;

/**
 * Created by gauravv7 on 14/4/17.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        switch (args[0]){
            case "q1":
                OddEvenWorker.main(args);
                break;

            case "q2":
                PrimeNonPrimeWorker.main(args);
                break;

            case "q3":
                com.threading.basics.q3.Main.main(args);
                break;

            case "q4":
                ReverseHello.main(args);
                break;

            case "q5":
                com.threading.basics.q5.Main.main(args);
                break;

            case "q6":
                com.threading.basics.q6.Main.main(args);
                break;

            case "q7":
                PubSub.main(args);
                break;

            case "q8":
                com.threading.basics.q8.PubSub.main(args);
                break;

            case "q9":
                com.threading.basics.q9.Main.main(args);
                break;

            case "q10":
                com.threading.basics.q10.SharedCounter.main(args);
                break;

            default:
                System.out.println("invalid input, please specify as q<(1-10)>");
        }
    }
}
