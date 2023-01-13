import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Notebook> set = new HashSet<>();
        set.add(new Notebook("Notebook 1", 8, "Windows10", 80000, "HP"));
        set.add(new Notebook("Notebook 2", 16, "Windows10", 85000, "Asus"));
        set.add(new Notebook("Notebook 3", 32, "MacOS", 85000, "Apple"));
        set.add(new Notebook("Notebook 4", 64, "Windows10", 90000, "Alinware"));
        Operation_With_Notebook operation = new Operation_With_Notebook(set);
        operation.start();
    }
}