package net.ytka;

import java.util.*;

public class Menu {


    public void menuHello() {
        System.out.println(">> Вас приветствует магазин в консоли. ");
        System.out.println(">> Выберите уровень доуступа:          ");
        System.out.println(">>                                    ");
        System.out.println(">> [1] Адинимстратор                  ");
        System.out.println(">> [2] Пользователь                   ");
        System.out.println(">> [3] Выйти из программы             ");


        Scanner scanner = new Scanner(System.in);
        try {
            int menuItem = scanner.nextInt();

            switch (menuItem){
                case 1:
                    System.out.println("Вы выбрали АДМИНИСТРАТОР");
                    break;
                case 2:
                    System.out.println("Вы выбрали ПОЛЬЗОВАТЕЛЬ");
                    break;
                case 3:
                    System.out.println("Вы покинули нас, костры вас не забудут \n" +
                            "Спасибо что пришли. Досвидания!");
                    break;
                default:
                    System.out.println("Вы сделали направильный выбор, костры вас не забудут \n" +
                            "Спасибо что пришли. Досвидания!");
                }
            }
        catch (NumberFormatException | IllegalFormatException | InputMismatchException e){
            System.out.println("Вы сделали направильный выбор, костры вас не забудут \n" +
                    "Спасибо что пришли. Досвидания!");
        }
        finally {
            System.out.println("Данные сохранены");
        }


    }

}



