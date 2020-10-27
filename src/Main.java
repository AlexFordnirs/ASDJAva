import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        ArrayList<Product> shop = new ArrayList<>();
        shop.add(new Product("MasineVOsh", 50, 50));
        shop.add(new Product("AplWathc", 10, 6));
        shop.add(new Product("Shuga", 5, 500));
        shop.add(new Product("GTX 3090 ti FE OC", 1, 50000));

        for (Product p : shop) {
            p.getProduct();
        }
        ArrayList<Product> basket = new ArrayList<>();

        System.out.println("Введите название товара");
        String title;

        for (int j = 0; j < 3; j++) {
            Scanner scanner = new Scanner(System.in);
            title = scanner.nextLine();
            System.out.println("Введите количество товара");
            int byShet = scanner.nextInt();

            Product p = new Product(title, 0, 0);
            p.hesh = byShet;
        }
            if (shop.contains(p)) {
                int i = shop.indexOf(p);
                basket.add(shop.get(i));
                shop.get(i).deGual();
            }
            int nimb = 0;
            for (Product tmp : basket) {
                tmp.getProduct();
                nimb = nimb + tmp.getPrice();
            }
            System.out.println("Цена : " + nimb);
        }

}
