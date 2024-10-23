package net.ytka;

public class Product {
    public String name= "Название";
    public String discription = "Описание";
    public float price = 0;
    public int availability = 0; //

    public String brandName= "Бренд";
    public float rating = 0;
    public float discount = 0;
    public int batch = 0;
    public int guaranteePeriod = 0; // указывается в месяцах


    public  Product (){

    }



    @Override
    public String toString() {
        return ("Наименование: " + this.name
                + "\ndiscription: "+this.discription
                +"\nprice: "+this.price
                + "\nbrand Name: "+this.brandName
                + "\nrating: "+this.availability
                + "\ndiscount: "+this.discount
                + "\nbatch: "+this.batch
                + "\nguaranteePeriod: "+this.guaranteePeriod
        );
    }



}
