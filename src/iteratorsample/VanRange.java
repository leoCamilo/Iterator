package iteratorsample;

public class VanRange implements Iterator<Vehicle> {
    private Vehicle[] vans;
    private int index = 0;
    
    @Override
    public boolean hasNext() {
        return (index < vans.length);
    }

    @Override
    public Vehicle next() throws ArrayIndexOutOfBoundsException{
        try {
            return vans[index++];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    @Override
    public void remove() {
        vans[index] = null;
    }
    
    public VanRange() {
        vans = new Vehicle[4];
        
        vans[0] = new Saloon("salão");
        vans[1] = new Saloon("salão 2");
        vans[2] = new Coupe("copo");
        vans[3] = new Sport("isporti");
    }
    
    public Vehicle[] getRange() {
        return vans;
    }
}
