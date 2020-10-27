import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Start");
        ArrayList<Product> shop= new ArrayList<>();
        shop.add(new Product("MasineVOsh",50,50));
        shop.add(new Product("AplWathc",10,6));
        shop.add(new Product("Shuga",5,500));
        shop.add(new Product("GTX 3090 ti FE OC",1,50000));
    }
}
