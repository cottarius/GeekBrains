// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Human h = new Human("Ivan");
        Human h2 = new Human("Sergey");
        Human h3 = new Human("Oleg");
        Human h4 = new Human("Petr");

        Market market = new Market();

        market.acceptToMarket(h);
        market.acceptToMarket(h2);
        market.acceptToMarket(h3);
        market.acceptToMarket(h4);

        market.update();

    }
}