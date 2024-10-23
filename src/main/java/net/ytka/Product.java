package net.ytka;

public class Product {
    public String name= "Название";
    public String discription = "Описание";
    public float price = 0;
    public int availability = 0;

    public String brandName= "Бренд";
    public float rating = 0;
    public float discount = 0;
    public int batch = 0;
    public int guaranteePeriod = 0; // указывается в месяцах


    public  Product (){

    }

    public void getProduct (){
        System.out.println("Наименование: "+this.name);
        System.out.println("discription: "+this.discription);
        System.out.println("price: "+this.price);
        System.out.println("brandName: "+this.availability);

        System.out.println("rating: "+this.brandName);
        System.out.println("discount: "+this.rating);
        System.out.println("batch: "+this.discount);
        System.out.println("Наименование: "+this.batch);
        System.out.println("guaranteePeriod: "+this.guaranteePeriod);

    }

}
