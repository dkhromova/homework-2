package task3;

public class Item {
    String name;
    String article;
    double price;
    int quantity;
    String color;

    public Item(String name, String article, int quantity, String color) {
        this.name = name;
        this.article = article;
        this.quantity = quantity;
        this.color = color;
        this.price = 10.5; // т.к. цена необязательный параметр, указываем минимальную цену по умолчанию, чтобы она никогда не была равна нулю
    }
}
