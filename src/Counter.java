public class Counter {
    private int count;

    public Counter() {
        this.count = 0;
    }

    public Counter(int startValue) {
        this.count = startValue;
    }

    public int value() {
        return this.count;
    }

    public void increase() {
        this.count++;
    }

    public void decrease() {
        this.count--;
    }

    public void increase(int increaseBy) {
        this.count += increaseBy;
    }

    public void decrease(int decreaseBy) {
        this.count -= decreaseBy;
    }
}
