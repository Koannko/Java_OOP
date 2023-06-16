package ru.geekbrains.lesson5.models;

import ru.geekbrains.lesson5.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {

    private Collection<Table> tables;

    /**
     * Получить все столики
     * @return
     */
    public Collection<Table> loadTables(){
        if (tables == null)
        {
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());

        }

        return tables;
    }

    /**
     * Бронирование столика
     * @param reservationDate Дата бронирования
     * @param tableNo Номер столика
     * @param name Имя клиента
     */
    public int reservationTable(Date reservationDate, int tableNo, String name){
        for (Table table: tables) {
            if (table.getNo() == tableNo){
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw new RuntimeException("Некорректный номер столика.");
    }

    /**
     * TODO: Разработать самостоятельно в рамках домашней работы
     * Поменять бронь столика
     */
    public int changeReservationTable(Date reservationDate, int tableNo, String name) {
        for (Table table : tables) {
            if (table.getNo() == tableNo) {
                Reservation reservationToRemove = null;
                for (Reservation reservation : table.getReservations()) {
                    if (reservation.getName().equals(name) && reservation.getDate().equals(reservationDate)) {
                        reservationToRemove = reservation;
                    }
                }
                if (reservationToRemove != null) {
                    table.getReservations().remove(reservationToRemove);
                } else {
                    throw new RuntimeException("There is no reservation under the given name for the table.");
                }
                reservationTable(reservationDate, tableNo, name);
            }
            //...
            //TODO: Для создания новой брони, можно воспользоваться уже существующим методом reservationTable
        }
        return 0;
    }
}
