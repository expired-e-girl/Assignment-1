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

        //Amount dropped in by customer
        int cash = Integer.parseInt(args[0]);
        System.out.println("Amount received: " + cash);

        //Cost of the item bought by customer
        int price = Integer.parseInt(args[1]);
        System.out.println("Price of the item: " + price);

        //Calculate owed change
        int change = cash - price;
        System.out.println("Required change: " + change);

        //Calculate amount of toonies that could be given back in change
        int toonies = change/200;
        change %= 200;
        System.out.println("Toonies x " + toonies);

        //Calculate amount of loonies that could be given back in change
        int loonies = change/100;
        change %= 100;
        System.out.println("Loonies x " + loonies);

        //Calculate amount of quarters that could be given back in change
        int quarters = change/25;
        change %= 25;
        System.out.println("Quarters x " + quarters);

        //Calculate amount of dimes that could be given back in change
        int dimes = change/10;
        change %= 10;
        System.out.println("Dimes x " + dimes);

        //Calculate amount of nickels that could be given back in change
        int nickels = change/5;
        change %= 5;
        System.out.println("Nickels x " + nickels);

        System.out.println("Enjoy!");
    }

}




