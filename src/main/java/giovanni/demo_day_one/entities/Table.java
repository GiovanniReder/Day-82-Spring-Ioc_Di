package giovanni.demo_day_one.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Table {
    private long numberOfTable;
    private int placeSetting;
    private boolean free;
}
/*
* ogni ordine è associato ad un tavolo
* numeroid
* numero di coperti massimo
* stato libero o occupato
*
*
* */