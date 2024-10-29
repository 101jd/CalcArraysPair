import calc.Calc;
import compare.ArraysComparator;
import other.Apple;
import other.Fruit;
import other.Orange;
import pair.Pair;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(Calc.divide(5, 2.0f));
        System.out.println(ArraysComparator.compare(
                new Fruit[]{new Fruit(), new Fruit(), new Fruit()},
                new Orange[]{new Orange(), new Orange(), new Orange()}
        ));
        System.out.println(new Pair<Integer, Orange>(5, new Orange()).toString());
    }
}