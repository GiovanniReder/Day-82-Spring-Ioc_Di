package giovanni.demo_day_one.dao;

import giovanni.demo_day_one.entities.Table;
import org.springframework.stereotype.Component;

@Component
public class MenuDAO {

    public double getCoperto(Table tavolo){
        return tavolo.getPlaceSetting() * 2.5;
    }
}
