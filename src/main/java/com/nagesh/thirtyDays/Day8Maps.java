package com.nagesh.thirtyDays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by nageshkumar
 * since  12/11/17.
 */
public class Day8Maps {
    public static void main(String []arg){
        Map<String,Integer> phoneMap = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneMap.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(phoneMap.containsKey(s)){
                System.out.println(s+"="+phoneMap.get(s));
            }
            else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
