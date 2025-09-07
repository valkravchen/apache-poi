package com.apachepoi.step1;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Step1Test {
    public static void main(String[] args) {
        System.out.println("=== APACHE POI ENTERPRISE КУРС ===");
        System.out.println("Проверяем библиотеку Apache POI...");
        // Создаём пустую Excel книгу в памяти
        XSSFWorkbook workbook = new XSSFWorkbook();
        System.out.println("Библиотека подключена успешно!");
        System.out.println("Создана пустая Excel книга");
        System.out.println("Количество листов: " + workbook.getNumberOfSheets());
        // Информация о курсе
        System.out.println("\n=== ПУТЬ К МАСТЕРСТВУ ===");
        System.out.println("Цель: Замена Power Query на Java");
        System.out.println("Шагов в курсе: 68");
        System.out.println("Финальный результат: Enterprise система автоматизации");

        System.out.println("\nГотов к изучению Apache POI!");
    }
}
