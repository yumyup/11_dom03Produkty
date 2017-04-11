import java.util.HashMap;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {


        HashMap<String, Product> product = new HashMap<>();
        product.put("Astra", new Product ("Astra", "opel", 12000 ));
        product.put("Leon", new Product("Leon", "seat",15000));
        product.put("Vectra", new Product("vectra", "opel", 32000));
        product.put("126p", new Product("126p", "fiat", 100.50));
        Scanner scan = new Scanner(System.in);
        System.out.println("podaj nazwę produktu");
        produkt = scan.nextLine();
        produkt.get(product)()
    }
}
