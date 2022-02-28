package Lesson02;

import java.util.Scanner;

public class Lab_2_2 {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vui lòng nhập vào một số nguyên: ");
        int number = scanner.nextInt();
        int remainder = number % 2;
        if (remainder == 0) {
            System.out.println("Số bạn nhập vào là một số chẵn!");
        } else{
            System.out.println("Số bạn nhập vào là một số lẻ!");
        }
    }
}