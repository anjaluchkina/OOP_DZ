package OOP_dz_5.presenters;

import java.util.Date;

public interface ViewObserver {

    void onReservationTable(Date orderDate, int tableNo, String name);

    void onChangeReservationTable(int oldReservationNo, Date orderDate, int tableNo, String name);
}