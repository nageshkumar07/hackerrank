package com.nagesh.thirtyDays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by nageshkumar
 * since  24/12/17.
 */
public class Day28Regex {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        Pattern pattern = Pattern.compile(".*@gmail.com");
        List<String> names = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String name = scan.next();
            if(pattern.matcher(scan.nextLine()).matches()){
                names.add(name);
            }
        }
        Collections.sort(names);
        for (String name: names) {
            System.out.println(name);
        }
    }
}