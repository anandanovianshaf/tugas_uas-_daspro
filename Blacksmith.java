// memasukan API arraylist yang sudah tersedia di Java
import java.util.ArrayList;
import java.util.List;

public class Blacksmith {

    // public adalah modifier yang membuat kelas bisa diakses dari kelas lain 
    // static adalah modifier, dimana atribut dan metode adalah milik kelas, bukan objek
    // membuat kelas Character
       public static class Character {
        // atribut kelas
        String name;
        double health;

        // konstruktor adalah special method yang digunakan untuk menginisialisasi object, konstruktor dipanggil saat kelas dibuat
        // method konstruktor untuk kelas Character
        public Character(String name, double health) {
            // this merujuk pada variabel yang ada di atribut kelas
            this.name = name;
            this.health = health;
        }
    }

    // membuat kelas senjata, yang berisi kumpulan senjata yang bisa di pilih
    public static class Weapon {
        // atribut dari senjata
        String name;
        String weaponType;
        double attackPower;
        int attackSpeed;

        // method konstruktor dari kelas senjata
        public Weapon(String name, String weaponType, double attackPower, int attackSpeed) {
            this.name = name;
            this.weaponType = weaponType;
            this.attackPower = attackPower;
            this.attackSpeed = attackSpeed;
        }

        // method toString adalah method yang bisa merubah nilai tipe data menjadi String
        // kegunaan toString disini adalah method agar output dari arraylist bisa dibaca oleh manusia (human readable)
        
        public String toString() {
            return name + "\n Type: " + weaponType + "\n Power: " + attackPower + "\n Speed: " + attackSpeed;
        }
    }

    // membuat kelas armor, yang berisi kumpulan senjata yang bisa di pilih
    public static class Armor {
        // atribut dari kelas armor
        String name;
        String armorType;
        double defensePower;

        // method konstruktor kelas Armor
        public Armor(String name, String armorType, double defensePower) {
            this.name = name;
            this.armorType = armorType;
            this.defensePower = defensePower;
        }

         // method toString adalah method yang bisa merubah nilai tipe data menjadi String
        // kegunaan toString disini adalah method agar output dari arraylist bisa dibaca oleh manusia (human readable)
        
        public String toString() {
            return name + "\n Type: " + armorType + "\n Defense: " + defensePower;
        }
    }

// membuat method membuat arraylist baru, yang mengembalikan list dari objek senjata, yang ditampung di dalam arraylist
    public static List<Weapon> createWeapons() {
        // instansi arraylist didalam list dengan nama variabel weapons
        List<Weapon> weapons = new ArrayList<>();
        // menambahkan senjata sesuai konstruktor yang telah dibuat
        weapons.add(new Weapon("Sword", " Light", 50.0, 70));
        weapons.add(new Weapon("Axe", " Medium", 70.0, 50));
        weapons.add(new Weapon("Claymore", " Heavy", 100.0, 20));
        // mengembalikan nilai weapon
        return weapons;

    }

    // membuat method yang sama seperti senjata, tetapi kali ini untuk armor
    public static List<Armor> createArmors() {
        List<Armor> armors = new ArrayList<>();
        armors.add(new Armor("Leather", " Light", 30));
        armors.add(new Armor("Scale Mail", " Medium", 50));
        armors.add(new Armor("Splint", " Heavy", 70));
        return armors;
    }
}
