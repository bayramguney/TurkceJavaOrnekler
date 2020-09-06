package DenemeCollection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Player {
    private String isim;
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
        return "||| ID : " + id + " Isim : " + isim;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id &&
                isim.equals(player.isim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isim, id);
    }
}
    public class HashCode_Equal {

        public static void main(String[] args) {
            Set<Player> hashset = new HashSet<>();
            Player player1 = new Player("Mustafa", 1);
            Player player2 = new Player("Mehmet", 10);
            Player player3 = new Player("Emre", 6);
            Player player4 = new Player("Mustafa", 1);  // iki mustafa 1 ama  bunlar farkli objeler
                                                                 // ama hashcode ve equal i override yaparsak
                                                                 // java iki objenin ayni oldugunu anlar
            hashset.add(player1);
            hashset.add(player2);
            hashset.add(player3);
            hashset.add(player4);

            for (Player s : hashset) {
                System.out.println(s);
            }


        }
    }
