package giovanni.demo_day_one.entities;


import java.util.List;

public class Pizza {
    private String name;
    private List<Toppings> toppingsList;

    private int calories;
    private double price;

    public Pizza(String name, double price, int calories, List<Toppings> toppingsList) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.toppingsList = toppingsList;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +

                ", calories=" + calories +
                ", price=" + price +
                '}';
    }


}
