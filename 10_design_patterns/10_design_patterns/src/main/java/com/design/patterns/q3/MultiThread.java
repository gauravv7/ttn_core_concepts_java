package com.design.patterns.q3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A class to read a file and print line numbers, if line has more than 15 chars then line itself is printed
 */
public class MultiThread implements Runnable {
        private static BufferedReader br = null;
        private List<String> list;

        static{
            try {
                br = new BufferedReader(new FileReader(System.getProperty("user.dir")+"/ThreadDemo.txt"),10);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

    public void run() {
        String line = null;
        int count = 0;
        while(true) {
            this.list = new ArrayList<String>();
            synchronized(br) {
                try {
                    while((line = br.readLine()) != null) {
                        if(count<15) {
                            list.add(line);
                            count++;
                        }else {
                            list.add(line);
                            count = 0;
                            break;
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(1);
                display(this.list);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(line == null)
                break;
        }


    }

    public void display(List<String> list) {
        for(String str:list) {
            System.out.println(str);
        }
        System.out.println(list.size());
    }

}
