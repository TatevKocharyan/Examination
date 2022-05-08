package immutableclass;

public final class InuttableClassExample {

    private final int number;
    private final String name;

    public InuttableClassExample(int number, String name) {
        this.number = number;
        this.name = name;
    }


    public int getNumber() {
        return number;
    }

    public String getName(){
    return name;
    }
}
