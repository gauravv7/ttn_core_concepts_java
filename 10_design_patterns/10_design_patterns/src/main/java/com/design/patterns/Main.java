package com.design.patterns;

public class Main {

    public static void main(String[] args) {
        switch (args[0]){
            case "q1":
                com.design.patterns.q1.Main.main(args);
                break;
            case "q2":
                com.design.patterns.q2.Main.main(args);
                break;
            case "q3":
                com.design.patterns.q3.Main.main(args);
                break;
            case "q4":
                com.design.patterns.q4.Main.main(args);
                break;
            default:
                System.out.println("invalid option, choose as q<1-4>");
        }
    }
}
