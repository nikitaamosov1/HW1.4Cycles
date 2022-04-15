public class Main {
    public static void main(String[] args) {
        ///Задание 1:
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(" " + i);
        }
        ;
        System.out.print("\n");
        for (int x = 10; x > 0; x--) {
            System.out.print(" " + x);
        }
        System.out.print("\n");
        ///Задание 2:
        for (int friday = 3; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница " + friday + " число, подготовь еженедельный отчет!");
        }
        System.out.print("\n");
        ///Задание 3:
        int startYear = 1822;
        int endYear = 2122;
        for (int year = 0;year < endYear;year = year + 79) {
            if (year > startYear && year < endYear) {
                System.out.println(year);
            }
        }
    }
}