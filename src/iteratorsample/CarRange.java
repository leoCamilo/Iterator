package iteratorsample;

import java.util.ArrayList;
import java.util.List;

public class CarRange implements Iterator<Vehicle> {
    private List<Vehicle> cars;
    private int index = 0;
    
    @Override
    public boolean hasNext() {
        return (index < cars.size());
    }

    @Override
    public Vehicle next() throws Exception {
        try {
            return cars.get(index++);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void remove() {
        cars.remove(index);
    }
    
    public CarRange() {
        cars = new ArrayList<Vehicle>();
        
        cars.add(new Saloon("salão"));
        cars.add(new Saloon("salão 2"));
        cars.add(new Coupe("copo"));
        cars.add(new Sport("esporti"));
    }
    
    public List<Vehicle> getRange() {
        return cars;
    }
}
