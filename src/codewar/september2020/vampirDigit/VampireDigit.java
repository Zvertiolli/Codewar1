package codewar.september2020.vampirDigit;

import java.util.ArrayList;

public class VampireDigit {

    public static ArrayList nunToArray(int num) {
        ArrayList <Integer> nums = new ArrayList();
        while (num > 0) {
            nums.add(num % 10);
            num /= 10;
        }
        return nums;
    }

    public static void main(String[] args) {
        int a= 21, b = 60;
        System.out.println(nunToArray(a));
        System.out.println(nunToArray(b));
        System.out.println(nunToArray(a*b));
    }
}
