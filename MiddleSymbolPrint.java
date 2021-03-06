import java.util.*;

public class MiddleSymbolPrint {

    //Напишете метод за показване на средния символ на низ
    //--Ако низа е нечетен ще има един среден низаз
    //--Ако низа е четен, ще има два средни низа

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Въведете текст");
        String text = input.nextLine();
        printMiddleSymbol(text);
    }



    public static void printMiddleSymbol(String text) {
        int digit = text.length();
        System.out.println("Брой символи: " + digit);
        int middle = digit%2; // целочислено делене %2,
        // при остатък 1 - имаме срден символ, при 0 - нямаме(т.е са два съседни)
        System.out.println("целочисл.делене, остатък: " + middle);

        if (middle !=0) {
            int midIndex = digit/2;
            System.out.printf("\nСредния символ е : %c", text.charAt(midIndex) );
        }else {
            int midIndex = (digit)/2 - 1;
            int secondIndex = digit/2;
            System.out.printf("\nСредните символи са : ... %c, ... %c,", text.charAt(midIndex), text.charAt(secondIndex));
        }

    }

}