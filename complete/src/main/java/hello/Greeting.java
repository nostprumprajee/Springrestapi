package hello;

public class Greeting {

    private final long idcard;
    private final long ibklid;
    private final String name;
    private final String flagtype;

    public Greeting(long idcard, String name, long ibklid, String flagtype) {
        this.idcard = idcard;
        this.name = name;
        this.ibklid = ibklid;
        this.flagtype = flagtype;
    }

    public long getIdcard() {
        return idcard;
    }

    public String getName() {
        return name;
    }
    public long getIbklid() {
        return ibklid;
    }
     public String getFlagtype() {
        return flagtype;
    }
}
