package org.example;

public class Homework1 {
    public static void main(String[] args) {

//     Метод проверяет, пустая ли строка, включая пробелы, табуляции и тд (их считает не пустыми) и возвращает true или false
        String emptyString = "  ";
        String notEmptyString = "123";
        boolean emptyResult1 = emptyString.isEmpty();
        boolean emptyResult2 = notEmptyString.isEmpty();
        System.out.println("Empty result 1: " + emptyResult1); // false
        System.out.println("Empty result 2: " + emptyResult2); // false

//     Метод проверяет, пустая ли строка, включая пробелы, табуляции и тд (их считает пустыми) и возвращает true или false
        String blankEmpty = "  ";
        String blankNotEmpty = "123";
        boolean blankResult1 = blankEmpty.isBlank();
        boolean blankResult2 = blankNotEmpty.isBlank();
        System.out.println("Blank result 1: " + blankResult1); // true
        System.out.println("Blank result 2: " + blankResult2); // false

//     Метод возвращает подстроку, принимает диапазон начального и конечного индекса строки (не включая конечный) или только начальный,
//     в таком случае вернет все с этого индекса и до конца
        String substringExample = "Hello World!";
        String substringResult1 = substringExample.substring(2, 7);
        String substringResult2 = substringExample.substring(7);
        System.out.println("Substring result 1: " + substringResult1); // llo W
        System.out.println("Substring result 2: " + substringResult2); // orld!

//     Метод ищет первое вхождение и возвращает расположение (индекс) символа или подстроки из строки. Если в строке не найден
//     нужный символ или подстрока, метод возвращает -1

        String indexExample = "Cats";
        int indexResult1 = indexExample.indexOf("t");
        int indexResult2 = indexExample.indexOf("ts");
        int indexResult3 = indexExample.indexOf("1");
        System.out.println("Index result 1: " + indexResult1); // 2
        System.out.println("Index result 2: " + indexResult2); // 2
        System.out.println("Index result 3: " + indexResult3); // -1

//     Метод ищет последнее вхождение и возвращает расположение (индекс) символа или подстроки из строки. Если в строке не найден
//     нужный символ или подстрока, метод возвращает -1
        String lastIndexExample = "Hello";
        int lastIndexResult1 = lastIndexExample.lastIndexOf("l");
        int lastIndexResult2 = lastIndexExample.lastIndexOf("1");
        System.out.println("Last index result 1: " + lastIndexResult1); // 3
        System.out.println("Last index result 2: " + lastIndexResult2); // -1

//     Метод преобразует все символы в заданной строке в нижний регистр (строчные) и возвращает новую переменную String
        String lower = "HeLlO WoRlD!";
        String lowerResult = lower.toLowerCase();
        System.out.println("Lower case result: " + lowerResult); // hello world!

//     Метод преобразует все символы в заданной строке в верхний регистр (заглавные) и возвращает новую переменную String
        String upper = "hello world!";
        String upperResult = upper.toUpperCase();
        System.out.println("Upper case result: " + upperResult); // HELLO WORLD

//     Метод заменяет один символ на другой и возвращает новую переменную String
        String replaceExample = "mom";
        String replaceResult = replaceExample.replace("m", "l");
        System.out.println("Replace result: " + replaceResult); // lol

//     Метод проверяет, начинается ли строка с указанной подстроки и возвращает true или false
        String startExample = "https://cat.com";
        boolean startResult1 = startExample.startsWith("https");
        boolean startResult2 = startExample.startsWith("com");
        System.out.println("Starts result 1: " + startResult1); // true
        System.out.println("Starts result 2: " + startResult2); // false

//     Метод проверяет, заканчивается ли строка на указанную подстроку и возвращает true или false
        String endExample = "Cat and dog";
        boolean endResult1 = endExample.endsWith("dog");
        boolean endResult2 = endExample.endsWith("cat");
        System.out.println("Ends result 1: " + endResult1); // true
        System.out.println("Ends result 2: " + endResult2); // false

//     Метод возвращает новую строку, которая содержит заданную строку, повторенную заданное количество раз
        String wordForRepeat = "HA";
        String repeatResult1 = wordForRepeat.repeat(10);
        String repeatResult2 = wordForRepeat.repeat(0);
        System.out.println("Repeat result 1: " + repeatResult1); // HAHAHAHAHAHAHAHAHAHA
        System.out.println("Repeat result 2: " + repeatResult2); //

//     Метод проверяет наличие подстроки в заданной строке и возвращает true или false, метод чувствителен к регистру
        String containsExample = "Hello World!";
        boolean containsResult1 = containsExample.contains("Hello");
        boolean containsResult2 = containsExample.contains("hello");
        System.out.println("Contains result 1: " + containsResult1); // true
        System.out.println("Contains result 2: " + containsResult2); // false

//     Метод соединяет две строки и возвращает новую строку
        String strOne = "Hello ";
        String strTwo = "World!";
        String result = strOne.concat(strTwo);
        System.out.println("Concat result: " + result); // Hello World!

//     Метод удаляет пробелы в начале и в конце строки, а также пробельные символы, например \t, \n. Возвращает новую строку
        String trimExample1 = " Hello World!  ";
        String trimExample2 = "\tHello World!";
        String trimResult1 = trimExample1.trim();
        String trimResult2 = trimExample2.trim();
        System.out.println("Trim result 1: " + trimResult1); // Hello World!
        System.out.println("Trim result 2: " + trimResult2); // Hello World!

//        Метод сравнивает строки и возвращает true или false. Метод чувствителен к регистру
        String equalsExample1 = "Cat";
        String equalsExample2 = "Cat";
        String equalsExample3 = "cat";
        String equalsExample4 = "Dog";
        boolean equalsResult1 = equalsExample1.equals(equalsExample2);
        boolean equalsResult2 = equalsExample1.equals(equalsExample3);
        boolean equalsResult3 = equalsExample1.equals(equalsExample4);
        System.out.println("Equals result 1: " + equalsResult1); // true
        System.out.println("Equals result 1: " + equalsResult2); // false
        System.out.println("Equals result 1: " + equalsResult3); // false
    }
}
