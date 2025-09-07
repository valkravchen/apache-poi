package com.apachepoi.step2;

public class FindWorkingDirectory {
    public static void main(String[] args) {
        System.out.println("Программа ищет файлы в: " + System.getProperty("user.dir"));
        System.out.println("Положите файл employees.xlsx в эту папку");
    }
}
