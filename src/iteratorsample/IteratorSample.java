package iteratorsample;

public class IteratorSample {
    public static void main(String[] args) {
        CarRange x = new CarRange();
        VanRange y = new VanRange();
        
        while (x.hasNext())
            try {
                System.out.print(x.next());
            } catch (Exception e) {
                e.printStackTrace();
            }

        while (y.hasNext())
            try {
                System.out.print(y.next());
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}