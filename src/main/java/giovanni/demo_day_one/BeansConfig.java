package giovanni.demo_day_one;


import giovanni.demo_day_one.entities.Drinks;
import giovanni.demo_day_one.entities.Menu;
import giovanni.demo_day_one.entities.Pizza;
import giovanni.demo_day_one.entities.Toppings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.ArrayList;
import java.util.List;

@Configuration

public class BeansConfig {

    @Bean
    public Pizza getMargherita(){
        List<Toppings> toppingsLista = new ArrayList<>();
        toppingsLista.add(getCheese());
        return new Pizza("Margherita" , 4.99 , 1104 , toppingsLista );
    }

    @Bean
    public Pizza getHawaiana(){
        List<Toppings> toppingsLista = new ArrayList<>();
        toppingsLista.add(getCheese());
        toppingsLista.add(getHam());
        toppingsLista.add(getPineapple());
        return new Pizza("Hawaiian", 6.49 , 1024 , toppingsLista);
    }

    @Bean
    public Pizza getSalami(){
        List<Toppings> toppingsLista = new ArrayList<>();
        toppingsLista.add(getCheese());
        toppingsLista.add(getSalame());
        return new Pizza("Salami", 5.99 , 1160 , toppingsLista );
    }



    @Bean
    public Drinks getLemonade(){
        return new Drinks("Lemonade" , 128 , 1.29);
    }
    @Bean
    public Drinks getWater(){
        return new Drinks("water" , 0 , 1.29);
    }
    @Bean
    public Drinks getWine(){
        return new Drinks("Wine" , 607 , 7.49);
    }


    @Bean
    public Toppings getCheese(){
        return new Toppings("cheese" , 92 , 0.69);
    }
    @Bean
    public Toppings getHam(){
        return new Toppings("ham" , 35 , 0.99);
    }
    @Bean
    public Toppings getOnions(){
        return new Toppings("onions" , 22 , 0.69);
    }
    @Bean
    public Toppings getPineapple(){
        return new Toppings("pineapple" , 24 , 0.79);
    }
    @Bean
    public Toppings getSalame(){
        return new Toppings("salame" , 86 , 0.99);
    }

    @Bean
    public Menu menu(){
        List<Pizza> pizzaList = new ArrayList<>();
        List<Drinks> drinkList = new ArrayList<>();
        List<Toppings> toppingsList = new ArrayList<>();

        pizzaList.add(getMargherita());
        pizzaList.add(getHawaiana());
        pizzaList.add(getSalami());

        drinkList.add(getLemonade());
        drinkList.add(getWine());
        drinkList.add(getWater());

        toppingsList.add(getCheese());
        toppingsList.add(getSalame());
        toppingsList.add(getHam());
        toppingsList.add(getPineapple());
        return new Menu(pizzaList , drinkList ,toppingsList);
    }

}







