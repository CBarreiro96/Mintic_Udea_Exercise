package collection;

import java.util.ArrayList;
import java.util.Scanner;


public class Collection {
    private ArrayList<Singer> singers = new ArrayList<>();

    public ArrayList<Singer> getSingers() {
        return singers;
    }

    public void setSingers(ArrayList<Singer> singers) {
        this.singers = singers;
    }

    public void addSinger(Singer singer) {
        singers.add(singer);
    }

    // FUnction searchsinger
    public String searchSinger(String nameSinger) {
        for (Singer singer: this.singers){
            if (nameSinger.equalsIgnoreCase(singer.getName())){
                return "Cantante encontrado";
            }
        }
        return "Cantante no encontrado";
    }
}
