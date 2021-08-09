package collection;

import java.util.ArrayList;

public class Singer {
    private String name;
    private String id;
    private ArrayList<Disk> disks = new ArrayList<>();

    public Singer(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Disk> getdisks() {
        return disks;
    }

    public void setdisks(ArrayList<Disk> disks) {
        this.disks = disks;
    }

    public long noSaleInnYourDisks(){
        // Recorrer la lista de disks y sumar la cantidad de ventas.
        long noSale = 0;
        for (Disk disk : this.disks){
            noSale += disk.getNoSales();
        }
        return noSale;
    }

    public void addDisk(Disk disk){
        // Agregar un disco más a la lista de los disks del cantante
        disks.add(disk);
    }

    public String searchDisk(String nameDisk){
        // Agregar un disco más a la lista de los disks del cantante
        for (Disk disk : this.disks){
            if (nameDisk.equalsIgnoreCase(disk.getName())){
                return "Disco encontrado";
            }
        }
        return "No encontrado";

    }   
}
