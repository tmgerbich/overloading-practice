import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Animal max = new Animal("Max");
    Animal cat = new Animal(false);
    TvShow breakingBad = new TvShow("Breaking Bad");
    TvShow friends = new TvShow("Friends", 100);
    TvShow friends2 = new TvShow("Friends", "Comedy");
    TvShow friends3 = new TvShow("Friends");
    Book warAndPeace = new Book("War and Peace", 800);
    Book seuss = new Book(20, 1990);
    Book motherGoose = new Book("Mother Goose");

    Counter counter1 = new Counter();
    System.out.println(counter1.value());
    counter1.increase();
    System.out.println(counter1.value());
    counter1.decrease();
    System.out.println(counter1.value());

    Counter counter2 = new Counter(5);
    System.out.println(counter2.value());
    counter2.increase(3);
    System.out.println(counter2.value());
    counter2.decrease(2);
    System.out.println(counter2.value());
    }
}
