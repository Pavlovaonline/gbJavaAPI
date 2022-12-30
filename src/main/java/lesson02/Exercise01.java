package lesson02;

import java.awt.*;
import java.io.File;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise01 {

    public static void main(String[] args) {
        ArrayList <String>al = new ArrayList<>();
        File dir = new File("C://GB//javaAPI//lesson01//src//main//java//lesson02//dir");
        if (dir.isDirectory()) {
            for (File item : dir.listFiles()) {
                if (item.isDirectory()) {
                    al.add("\n" + item.getName() + ": folder");
                } else {
                    String s = item.getName();
                    s = s.substring(s.lastIndexOf('.')+1);
                    al.add("\nfile extension " + item.getName() + ": " + s);
                }
            }
        }
        System.out.println(al);
    }
}

