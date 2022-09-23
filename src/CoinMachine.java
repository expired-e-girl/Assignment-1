/*
 Marilyn Ruptash
 ID: 261126626
 *********************
 This code will determine the amount of change that would be returned given the amount of
 money dropped into the coin machine by a customer.
 *********************
*/

public class CoinMachine {
    public static void main(String[] args) {

        int cash = Integer.parseInt(args[0]); //Amount dropped in by customer
        System.out.println("Amount received: " + cash);

        int price = Integer.parseInt(args[1]); //Cost of the item bought by customer
        System.out.println("Price of the item: " + price);

        int change = cash - price;  //Calculate owed change
        System.out.println("Required change: " + change);

        int toonies = change/200; //
        change %= 200;
        System.out.println("Toonies x " + toonies);

        int loonies = change/100;
        change %= 100;
        System.out.println("Loonies x " + loonies);

        int quarters = change/25;
        change %= 25;
        System.out.println("Quarters x " + quarters);

        int dimes = change/10;
        change %= 10;
        System.out.println("Dimes x " + dimes);

        int nickels = change/5;
        change %= 5;
        System.out.println("Nickels x " + nickels);

        System.out.println("Enjoy!");
    }

}




