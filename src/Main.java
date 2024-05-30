import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int Vasya = random.nextInt(3);
        int Petya = random.nextInt(3);
        System.out.printf("Начинаем игру?");
        String s = scanner.nextLine();
        System.out.printf("Суефа!!!\n");
        System.out.printf("Суефа!!!\n");
        System.out.printf("Суефа!!!\n");

        if (Vasya==0){
            System.out.printf("Вася выбрал: Камень \n");
        }
        else if (Vasya==1){
            System.out.printf("Вася выбрал: Ножницы \n" );
        }else if (Vasya==2){
            System.out.printf("Вася выбрал: Бумага \n");
        }if (Petya==0){
            System.out.printf("Петя выбрал: Камень \n");
        }
        else if (Petya==1){
            System.out.printf("Петя выбрал: Ножницы \n" );
        }else if (Petya==2){
            System.out.printf("Петя выбрал: Бумага \n");
        }
        if (Petya == 0) {
            if (Vasya == 0) {
                System.out.println("Ничья");
            } else if (Vasya == 1) {
                System.out.println("Петя проиграл");
            } else if (Vasya == 2) {
                System.out.println("Вася выйграл");
            }
        } else if (Petya == 1) {
            if (Vasya == 0) {
                System.out.println("Вася выйграл");
            } else if (Vasya == 1) {
                System.out.println("Ничья");
            } else if (Vasya == 2) {
                System.out.println("Петя выйграл");
            }
        } else if (Petya == 2) {
            if (Vasya == 0) {
                System.out.println("Петя выйграл");
            } else if (Vasya == 1) {
                System.out.println("Вася выйграл");
            } else if (Vasya == 2) {
                System.out.println("Ничья");
            }
        }
    }
}

