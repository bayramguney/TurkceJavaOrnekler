package DenemeListSortComparableInterface;

import java.util.*;

class BuyuktenKucugeString   implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }
}

class KucuktenBuyugePlayer implements Comparator<Player> {


    @Override
    public int compare(Player o1, Player o2) {
        if (o1.getId() < o2.getId()) {
            return -1;
        } else if (o1.getId() > o2.getId()) {
            return +15;
        } else {
            return 0;
        }
    }
}
class BuyuktenKucugePlayer implements Comparator<Player> {


    @Override
    public int compare(Player o1, Player o2) {
        if (o1.getId() > o2.getId()) {
            return -1;
        } else if (o1.getId() < o2.getId()) {
            return +15;
        } else {
            return 0;
        }
    }
}
class KucuktenBuyugeStringPlayer implements Comparator<Player>{

    @Override
    public int compare(Player o1, Player o2) {
        return o1.getIsim().compareTo(o2.getIsim());
    }
}
class Player implements Comparable<Player> {
    private String isim;
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "||| ID : " + id + " Isim : " + isim;
    }


    @Override
    public int compareTo(Player player) {
        if(this.id<player.id){
            return -1;
        }else if (this.id>player.id){
            return 1;

        }else{
            return  0;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        List<String>list_string=new ArrayList<>();
        list_string.add("Java");
        list_string.add("C++");
        list_string.add("Pnython");
        list_string.add("Php");
        list_string.add("Go");

        Collections.sort(list_string);
        for (String s:list_string){
            System.out.println(s);
        }
        System.out.println("**************************************");

        Collections.sort(list_string,new BuyuktenKucugeString());  // Buyukten kucuge donusturen class imiz
        for (String s:list_string){
            System.out.println(s);
        }

        System.out.println("**************************************");



        List<Player> player = new ArrayList<>();
        player.add(new Player("Murat",5));
        player.add(new Player("Ali",1));
        player.add(new Player("Oguz",10));
        player.add(new Player("Yusuf",4));

        Player p1=new Player("murat",5);
        Player p2=new Player("Ali",1);

        System.out.println(p1.compareTo(p2));  // kendi objelerimizi  karsilastirmak icin...
        Collections.sort(player);
        for (Player p:player) {
            System.out.println(p);
        }
        System.out.println("*******Kucukten Buyuge Player****************");
        Collections.sort(player,new KucuktenBuyugePlayer());
        for (Player p:player) {
            System.out.println(p);
        }
        System.out.println("********Buykten kucuge player***************");
        Collections.sort(player,new BuyuktenKucugePlayer());
        for (Player p:player) {
            System.out.println(p);
        }
        System.out.println("**************Kucukten buyuge isim Player*********");
        Collections.sort(player,new KucuktenBuyugeStringPlayer());
        for (Player p:player) {
            System.out.println(p);
        }

        // veya anonim inner class larda oldugu gibi  de yapilabilir bu avantajli ...

        Collections.sort(player, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return -o1.getIsim().compareTo(o2.getIsim());
            }
        });
        System.out.println(" *****Colection sort comparator ile buyukten kucuge isim player");
        for (Player p:player) {
            System.out.println(p);
        }


        System.out.println("************************8");
        Set<Player>treeset=new TreeSet<>();
        treeset.add(new Player("murat",5));
        treeset.add(new Player("Ali",1));
        treeset.add(new Player("Oguz",10));
        treeset.add(new Player("Yusuf",4));

    }
}
