package giovanni.demo_day_one.entities;

import giovanni.demo_day_one.enums.OrderStateEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Order {
    private long orderId;
    private Table tavolo;
    private OrderStateEnum orderState;
    private int placeSettings;
    private double acquisitionTime;
    private List<Pizza> pizzas;
    private List<Drinks> drinks;
    private List<Toppings> toppings;


}
