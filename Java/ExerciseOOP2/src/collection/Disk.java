package collection;

public class Disk {
    private String name;
    private int noSales;

    public Disk(String name, int noSales) {
        this.name = name;
        this.noSales = noSales;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoSales() {
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
