package net.ytka;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Menu {

    boolean flagFirstMenu = true;



    public void menuHello() {
        System.out.println(">> Вас приветствует магазин в консоли. ");
        System.out.println(">> Выберите уровень доуступа:          ");
        System.out.println(">>                                    ");
        System.out.println(">> [1] Адинимстратор                  ");
        System.out.println(">> [2] Пользователь                   ");
        System.out.println(">> [3] Выйти из программы             ");
        while (flagFirstMenu == true) {

            Scanner scanner = new Scanner(System.in);
            try {
                int menuItem = scanner.nextInt();

                switch (menuItem) {
                    case 1:
                        System.out.println("Вы выбрали АДМИНИСТРАТОР");
                        flagFirstMenu = auntification();
                        break;
                    case 2:
                        System.out.println("Вы выбрали ПОЛЬЗОВАТЕЛЬ");
                        flagFirstMenu = auntification();
                        break;
                    case 3:
                        System.out.println("Вы покинули нас, костры вас не забудут \n" +
                                "Спасибо что пришли. Досвидания!");
                        break;
                    default:
                        System.out.println("Вы сделали направильный выбор, костры вас не забудут \n" +
                                "Спасибо что пришли. Досвидания!");
                }
            } catch (NumberFormatException | IllegalFormatException | InputMismatchException e) {
                System.out.println("Вы сделали направильный выбор, костры вас не забудут \n" +
                        "Спасибо что пришли. Досвидания!");
                flagFirstMenu = false;
            }

        }
    }// блок menuHello

    public boolean auntification() {

        System.out.println(">>                                    ");
        System.out.println(">> [1] Вход                           ");
        System.out.println(">> [2] Регистрация                    ");
        System.out.println(">> [3] Вернутся назад                 ");
        Scanner scanner = new Scanner(System.in);
        try {
            int menuItem = scanner.nextInt();
            switch (menuItem) {
                case 1:
                    System.out.println("функция проверки пароля  ");

                    // функция проверки пароля и логина
                    return false;
                case 2:
                    System.out.println("функция регистрации");
                    menuRegestration();
                    // функция проверки пароля
                    return false;
                case 3:
                    System.out.println("Возврат фалг смена на меню");
                    flagFirstMenu = true;
                    return true;
                default:
                    System.out.println("Вы сделали направильный выбор, попробуйте ещё раз");
                    return true;
            }
        } catch (NumberFormatException | IllegalFormatException | InputMismatchException e) {
            System.out.println("Вы сделали направильный выбор, костры вас не забудут \n" +
                    "Спасибо что пришли. Досвидания!");
            return false;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public void menuRegestration () throws IOException {
        boolean flag = true;
        System.out.println(">> Вам необходимо зарегестрироваться ");
        System.out.println(">> Придумайте логин:          ");
        Scanner scanner = new Scanner(System.in);
        File file = new File("Password.txt"); // Создание объекта File
        if (file.createNewFile()) { // Создание файла, если он не существует
            System.out.println("Файл успешно создан.");
        } else {
            System.out.println("Файл уже существует.");
        }
        try (FileWriter fileWriter = new FileWriter("Password.txt", true)) { // Используем try-with-resources
            // Записываем текст в файл
            User user = new User();
            fileWriter.write(user.toString());
            fileWriter.write("\n");
            // Переход на новую строку
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
        System.out.println(">> Данные пользователя успешно записаны  ");
        System.out.println(">> Возврат в главное меню ");

        menuHello();
    }

}





