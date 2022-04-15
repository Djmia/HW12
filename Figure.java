import java.util.*;

public class Figure {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Изберете вид фигура :");
        System.out.println("1 -- за Триъгълник \n2 -- за Правоъгълник \n3 -- за Кръг ");
        byte figure = input.nextByte();
        double face = 0;

        if (figure==1) {
            System.out.println("\nВие избрахте ТРИЪГЪЛНИК :");
            face = calcTriangel(input);                                 // МЕТОД ЗА ТРИЪГЪЛНИК
        } else {
            if (figure==2) {
                System.out.println("\nВие избрахте ПРАВОЪГЪЛНИК :");
                face = calcRectangel(input);                          // МЕТОД ЗА ПРАВОЪГЪЛНИК
            } else {
                if ( figure==3) {
                    System.out.println("\nВие избрахте КРЪГ :");
                    face = calcCircle(input);                            // МЕТОД ЗА КРЪГ
                } else {
                    System.out.println("\nНЕВАЛИДНИ ДАННИ :");
                }

            }

        }

    }

    public static double calcTriangel(Scanner input) {

        System.out.println("Програма за проверка на вид триъгълник :");
        System.out.println("----------------------------------------");
        System.out.println("Въведете страна 'X' :");
        double sideX = input.nextDouble();
        System.out.println("Въведете страна 'Y' :");
        double sideY = input.nextDouble();
        System.out.println("Въведете страна 'Z' :");
        double sideZ = input.nextDouble();

        if (sideX <=0 || sideY <=0 || sideZ <=0) {
            System.out.println("\nНЕВАЛИДНИ ДАННИ :");
        } else
        if (sideX == sideY && sideX == sideZ) {
            System.out.println("Тригълника е: РАВНОСТРАНЕН");
            System.out.println("--------------------------");
        } else {
            if (sideX == sideY || sideX == sideZ || sideY == sideZ) {
                System.out.println("Тригълника е: РАВНОБЕДРЕН");
                System.out.println("--------------------------");
            } else {
                System.out.println("Тригълника е: РАЗНОСТРАНЕН");
                System.out.println("--------------------------");
            }
        }

        double perimeterP = (sideX + sideY + sideZ);
        System.out.printf("\nОбиколката на тригълника е: P = %.2f", perimeterP);
        double semiperimeterP = ((sideX + sideY + sideZ)/2);
        double px = (semiperimeterP - sideX);
        double py = (semiperimeterP - sideY);
        double pz = (semiperimeterP - sideZ);
        double faceS = Math.sqrt((semiperimeterP*px*py*pz));

        System.out.printf("\nЛицето: S = %.2f", faceS);
        return faceS;
    }




    public static double calcRectangel(Scanner input) {

        System.out.println("Въведете страна 'A' :");
        double sideA = input.nextDouble();
        System.out.println("Въведете страна 'B' :");
        double sideB = input.nextDouble();


        double perimeterAB = (sideA*2 + sideB*2);
        System.out.printf("\nОбиколката на Правоъгълника е: P = %.2f", perimeterAB);
        double faceAB = sideA*sideB;

        System.out.printf("\nЛицето: S = %.2f", faceAB);
        return faceAB;
    }



    public static double calcCircle(Scanner input) {

        System.out.println("Въведете диаметър на кръга 'D' :");
        double sideD = input.nextDouble();

        double perimeterD = (sideD*3.14);
        System.out.printf("\nОбиколката на Кръга е: P = %.2f", perimeterD);
        double faceD = ((3.14*(sideD*sideD))/4);

        System.out.printf("\nЛицето: S = %.2f", faceD);
        return faceD;
    }
}