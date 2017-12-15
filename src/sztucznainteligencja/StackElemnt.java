package sztucznainteligencja;

public class StackElemnt  {

    private int value;
    private StackElemnt next;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public StackElemnt getNext() {
        return next;
    }

    public void setNext(StackElemnt next) {
        this.next = next;
    }
}
