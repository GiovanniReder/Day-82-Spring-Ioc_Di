package giovanni.demo_day_one.entities;

import giovanni.demo_day_one.enums.OrderStateEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Order {
    private long orderId;
    @Autowired
    private Table tavolo;
   // @Enumerated(EnumType.STRING)
    private OrderStateEnum orderState;
    private int placeSettings;
    private double acquisitionTime;
    private List<Pizza> pizzas;
    private List<Drinks> drinks;
    private List<Toppings> toppings;




}
/*
* numero arbitrario di elementi del menu quindi pizzas drinks and toppings
* numero ordine
* stato
*numero di coperti
*ora di acquisizione
* importo totale sommare il getPrice di pizze drink e topping e placeSetting di Table * costo.coperto (2.5)
* */