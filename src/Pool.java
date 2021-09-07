
public class Pool {
    private double length;

    public Pool(int length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getTimeToOvercomePool(CanSwim swimmer) {
        return swimmer.swim(this);    // тут не ясно то происходит
    }
}

