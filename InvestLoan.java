import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        // Инвестиция 1000 лв.
        // Лихва 10 %
        // Срок 5 години
        
        Scanner input = new Scanner(System.in);
        double investEnd = calcInvest(input);
       
       
    }
    
    public static double calcInvest(Scanner input) {
       
        System.out.println("Въведи стойност на инвестицията");
        double glavnitsa = input.nextDouble();
        System.out.println("Въведи годишен лихвен процент");
        double lihva = input.nextDouble();
        lihva = lihva/100; //10% = 0.10
        System.out.println("Въведи срок на инвестицията");
        double srok = input.nextDouble();
        srok = srok*12; // 5 год. = 60 месеца
        
        double investEnd = glavnitsa*lihva*srok/12;
        double investMonths = glavnitsa*lihva/12;
        System.out.printf("|Инвестиция    |%.2f%n|Лихва период  |%.2f%n|Тотал         |%.2f%n\n|Мес.лихва     |%.2f%n", glavnitsa, investEnd, (glavnitsa+investEnd), investMonths);
        
        return investEnd;
       
      
    
}

}