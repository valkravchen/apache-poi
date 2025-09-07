package com.apachepoi.step2;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class Step2 {
    public static void main(String[] args) {
        System.out.println("=== ШАГ 2: ОТКРЫТИЕ EXCEL ФАЙЛА ===");
        try {
            FileInputStream file = new FileInputStream("employees.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            System.out.println("Файл employees.xlsx открыт успешно!");
            System.out.println("Количество листов: " + workbook.getNumberOfSheets());
            if (workbook.getNumberOfSheets() > 0) {
                System.out.println("Название первого листа: " + workbook.getSheetName(0));
                System.out.println("Количество строк: " + (workbook.getSheetAt(0).getLastRowNum() +1));
                file.close();
                workbook.close();
                System.out.println("\nГотов к Шагу 3: Навигация по листам!");
            }
        } catch (Exception e) {
            System.out.println("Ошибка при открытии файла: " + e.getMessage());
            System.out.println("Проверьте, что файл employees.xlsx находится в папке проекта");
        }
    }
}
