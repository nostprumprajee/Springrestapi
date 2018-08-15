package hello;

public class Greeting {

    private final long id;
//    private final long ibklid;
    private final String name;

    public Greeting(long id, String name) {
        this.id = id;
        this.name = name;
//        this.ibklid = ibklid;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
//    public long getIbklid() {
//        return ibklid;
//    }
}
