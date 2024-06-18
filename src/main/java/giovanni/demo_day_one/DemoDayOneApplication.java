package giovanni.demo_day_one;


import giovanni.demo_day_one.entities.Drinks;

import giovanni.demo_day_one.entities.Menu;
import giovanni.demo_day_one.entities.Pizza;

import giovanni.demo_day_one.entities.Toppings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication

public class DemoDayOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDayOneApplication.class, args);

		AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext(DemoDayOneApplication.class);
/*
		Pizza margherita = (Pizza) cxt.getBean("getMargherita");
		Pizza hawaiana = (Pizza) cxt.getBean("getHawaiana");
		Pizza salami = (Pizza) cxt.getBean("getSalami");

		Toppings cheese = (Toppings) cxt.getBean("getCheese");
		Toppings ham = (Toppings) cxt.getBean("getHam");
		Toppings onions = (Toppings) cxt.getBean("getOnions");
		Toppings pineapple = (Toppings) cxt.getBean("getPineapple");
		Toppings salame = (Toppings) cxt.getBean("getSalame");


		Drinks lemonade = (Drinks) cxt.getBean("getLemonade");
		Drinks water = (Drinks) cxt.getBean("getWater");
		Drinks wine = (Drinks) cxt.getBean("getWine");







		System.out.println("ECCO IL NOSTRO MENU");
		System.out.println(" ");
		System.out.println("Pizzas");

		System.out.println(margherita);
		System.out.println(hawaiana);
		System.out.println(salami);

		System.out.println(" ");
		System.out.println("Toppings");
		System.out.println(" ");

		System.out.println(cheese);
		System.out.println(ham);
		System.out.println(onions);
		System.out.println(pineapple);
		System.out.println(salame);

		System.out.println(" ");
		System.out.println("Drinks");
		System.out.println(" ");

		System.out.println(lemonade);
		System.out.println(water);
		System.out.println(wine);

*/
		Menu menu = (Menu) cxt.getBean("menu");
		menu.getMenu();










		cxt.close();


	}

}
