package collection;

import java.util.ArrayList;

public class Singer {
    private String name;
    private String id;
    private ArrayList<Disk> disks;

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

    public Integer noSaleInnYourDisks(){
        // Recorrer la lista de disks y sumar la cantidad de ventas.
        return 0;
    }

    public void addDisk(Disk disks){
        // Agregar un disco más a la lista de los disks del cantante
    }

    public void searchDisk(String nombreDisco){
        // Agregar un disco más a la lista de los disks del cantante
    }
}
