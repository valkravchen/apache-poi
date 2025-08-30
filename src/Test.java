import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test {
    public static void main(String[] args) {
        System.out.println("Проверяем Apache POI...");
        XSSFWorkbook workbook = new XSSFWorkbook();
        System.out.println("Библиотека работает!");
    }
}