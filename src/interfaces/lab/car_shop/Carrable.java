package interfaces.lab.car_shop;

import java.io.Serializable;

public interface Carrable extends Serializable {
    int TIRES = 4;

    String getModel();
    String getColor();
    Integer getHorsePower();
    String countryProduced();

}
