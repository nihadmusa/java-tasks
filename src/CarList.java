import java.util.ArrayList;
import java.util.List;

public class CarList {
    static List<Car> cars = new ArrayList<>();
    public static void addCars(Car car){
        if (car.getYear() >= 2000) cars.add(car);
        else throw new MyExp(car.getBrand()+" "+car.getModel()+" "+ "kohnedir");
    }
}
