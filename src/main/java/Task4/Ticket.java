package Task4;

import java.time.LocalDateTime;

/**
 * класс билета
 */
public class Ticket {

    public int rootNumber;
    public int place;
    public int price;
    public LocalDateTime date;
    public boolean isValid;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public int getRootNumber() {
        return rootNumber;
    }

    public void setRootNumber(int rootNumber) {
        this.rootNumber = rootNumber;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(boolean valid) {
        isValid = valid;
    }

    //конструктор билетов
    public Ticket(int rootNumber, int place, int price, boolean isValid) {
        this.rootNumber = rootNumber;
        this.place = place;
        this.price = price;
        this.isValid = isValid;
    }

}
