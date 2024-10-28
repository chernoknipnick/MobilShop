package net.ytka;


public class User {
    public String name = "Имя";
    public String secondName = "Фамилия";
    public String adress = "Адрес проживания";
    public String Phone = "Номер телефона"; //Переписать под собственный класс телефон или найти реализацию
    public String email = "Электронная почта";// Перпеписать под собственный класс или найти реализацию
    public String orderList = "Список заказов";

    //История покупок
    //ID корзина


     public void userMenu (){

     }

    @Override
    public String toString() {
        return ("Имя: " + this.name
                + "\nФамилия: "+this.secondName
                +"\nАдрес проживания: "+this.adress
                + "\nНомер телефона: "+this.Phone
                + "\nЭлектронная почта: "+this.email
                + "\nСписок заказов: "+this.orderList

        );
    }
}
