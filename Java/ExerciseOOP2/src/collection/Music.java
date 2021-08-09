package collection;

public class Music {
    public static void main(String[] args) {
        Collection Disk1 = new Collection();
        /* -------------------------------------*/
        Singer Shakira = new Singer("Shakira","1234");
        Disk Miami = new Disk("WAKAWAK",1000000);
        Disk kuku = new Disk("gogo",1010100);
        Shakira.addDisk(Miami);
        Shakira.addDisk(kuku);

        Disk1.getSingers().add(Shakira);
        System.out.println(Shakira.noSaleInnYourDisks());
    }
}
