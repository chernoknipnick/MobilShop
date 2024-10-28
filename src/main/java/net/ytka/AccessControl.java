package net.ytka;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

enum AccessLevel {
    GUEST,
    USER,
    ADMIN
}

class MenuItem {
    private String name;
    private AccessLevel accessLevel;

    public MenuItem(String name, AccessLevel accessLevel) {
        this.name = name;
        this.accessLevel = accessLevel;
    }

    public String getName() {
        return name;
    }

    public AccessLevel getAccessLevel() {
        return accessLevel;
    }
}


public class AccessControl {
    private List<MenuItem> menuItems;

    public AccessControl() {
        menuItems = new ArrayList<>();
        // Инициализация меню
        menuItems.add(new MenuItem("View Profile", AccessLevel.GUEST));
        menuItems.add(new MenuItem("Edit Profile", AccessLevel.USER));
        menuItems.add(new MenuItem("Admin Settings", AccessLevel.ADMIN));
    }

    public void displayMenu(AccessLevel userAccessLevel) {
        System.out.println("Available menu items:");
        for (MenuItem item : menuItems) {
            // Проверка доступа
            if (item.getAccessLevel().ordinal() <= userAccessLevel.ordinal()) {
                System.out.println("- " + item.getName());
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос уровня доступа у пользователя
        System.out.println("Enter your access level (GUEST, USER, ADMIN):");
        String input = scanner.nextLine().toUpperCase();

        AccessLevel userAccessLevel;
        try {
            userAccessLevel = AccessLevel.valueOf(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid access level. Defaulting to GUEST.");
            userAccessLevel = AccessLevel.GUEST;
        }

        AccessControl accessControl = new AccessControl();
        accessControl.displayMenu(userAccessLevel);
    }
}
