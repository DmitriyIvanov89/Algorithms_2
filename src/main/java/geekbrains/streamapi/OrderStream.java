package geekbrains.streamapi;

public class OrderStream {

    private int id;
    private String context;

    public OrderStream(int id, String context) {
        this.id = id;
        this.context = context;
    }

    public int getId() {
        return id;
    }

    public String getContext() {
        return context;
    }
}
