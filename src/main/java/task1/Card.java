package task1;

public class Card {
    public static void main(String[] args) {
        String cardNumber = "1234 5678 9012 3456";
        String replaceNumber = cardNumber.replace(" ", "");
        System.out.println("**** **** **** " + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("**** **** **** " + replaceNumber.substring(replaceNumber.length() - 4));
    }
}
