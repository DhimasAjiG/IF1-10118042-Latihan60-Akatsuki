
package if1.pkg10118042.latihan60.akatsuki;

/**
 * @author
 * Nama  : Dhimas Aji Ghairrahmat
 * Kelas : IF1
 * NIM   : 10118042
 * Deskripsi Program : Program ini berfungsi untuk Menampilkan Keterangan Character Detective Conan
 */
public class IF110118042Latihan60Akatsuki {

    
    public static void main(String[] args) {
      String cloth = "Black Red Cloud";
        String goal = "Gathering all Jinchuriki";
        
        Member deidara = new Member("Deidara", "Iwagakure", "Explosive Clay", "S-Rank Missing Ninja", "Explosive Release", "Killed in Battle by Chiyo", true, cloth, goal);
        Member sasori = new Member("Sasori", "Sunagakure", "Hiruko", "S-Rank Missing Ninja from Sunagakure's Puppet Brigade", "Puppet Mastery", "Killed in Battle by Sakura", true, cloth, goal);
        Member kisame = new Member("Kisame Hoshigaki", "Kirigakure", "Samehada", "S-Rank Missing Ninja", "Shark-o-mation", "Committed Suicide", true, cloth, goal);
        Member itachi = new Member("Itachi Uchiha", "Konohagakure", "Kunai", "Anbu Captain Missing Ninja", "Mangekyo Sharingan", "Killed by his own brother", true, cloth, goal);
        Member orochimaru = new Member("Orochimaru", "Konohagakure", "Snakes", "Konohagakure's Legendary Sannin", "Power of White Snake", "Killed & Revived by Sasuke", false, cloth, goal);
        Member tobi = new Member("Tobi / Obito Uchiha", "Konohagakure", "Explosive Bomb", "S-Rank Missing Ninja", "Kamui", "Killed by Kaguya from trying to save Kakashi", false, cloth, goal);
        
        System.out.println("TOP SECRET : Akatsuki");
        System.out.println("=====================");
        System.out.println();
        System.out.println("Cloth : " + deidara.getClothes());
        System.out.println("Goal : " + deidara.getGoals());
        System.out.println();
        
        deidara.displayMember();
        sasori.displayMember();
        kisame.displayMember();
        itachi.displayMember();
        orochimaru.displayMember();
        tobi.displayMember();
    }
    
}
