package task3;

public class Task3 {
    public static void main(String[] args) {
        Item tShirt = new Item("Футболка", "A12738B101", 3, "Голубой");
        Item jacket = new Item("Куртка", "A12008B101", 7, "Черный");
        jacket.price = 12.5;
        Item skirt = new Item("Юбка", "A12738B122", 5, "Красный");
        Item pants = new Item("Брюки", "A33338B121", 2, "Коричневый");
        pants.price = 7.5;
        Item sweater = new Item("Свитер", "A1098338B121", 10, "Зеленый");
        sweater.price = 11.5;

        System.out.println(tShirt.article + " - " + tShirt.name + " - " + tShirt.price + "$ - " + tShirt.quantity + " - " + tShirt.color);
        System.out.println(jacket.article + " - " + jacket.name + " - " + jacket.price + "$ - " + jacket.quantity + " - " + jacket.color);
        System.out.println(skirt.article + " - " + skirt.name + " - " + skirt.price + "$ - " + skirt.quantity + " - " + skirt.color);
        System.out.println(pants.article + " - " + pants.name + " - " + pants.price + "$ - " + pants.quantity + " - " + pants.color);
        System.out.println(sweater.article + " - " + sweater.name + " - " + sweater.price + "$ - " + sweater.quantity + " - " + sweater.color);
    }
}
