package giovanni.demo_day_one;

import giovanni.demo_day_one.entities.Menu;
import giovanni.demo_day_one.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    private Menu menu;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("-------APPLICAZIONE INIZIALIZZATA DAL RUNNER------- ");
menu.getMenu();



    }
}
