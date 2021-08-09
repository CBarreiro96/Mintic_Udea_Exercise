package collection;

public class Disk {
    private String name;
    private long noSales;

    public Disk(String name, long noSales) {
        this.name = name;
        this.noSales = noSales;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNoSales() {
        return noSales;
    }

    public void setNoSales(int noSales) {
        this.noSales = noSales;
    }
    @Override
    public String toString() {
        return name;
    }

}
