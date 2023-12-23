import java.util.List;

// memasukan API scanner untuk menginput
import java.util.Scanner;

public class JavaBattleField {

    public static void main(String[] args) {

        // membuat objek scanner baru
        Scanner input = new Scanner(System.in);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t \t \tWELCOME TO THE JAVA BATTLE FIELD\n");
        System.out.println("\t You have been chosen to be part of the victory!!! \n The demons in the Java Country are becoming stronger. We need you, traveler, \n to fight all the demons and win this fight. It is time for you to fight!!! ");
        System.out.println("\n  Let's make you a character to fight the demons");
        System.out.print("\n Enter your character name : ");

        // membuat variabel untuk input nama character yang dimasukan pengguna
        String charName = input.nextLine();

        // variabel untuk darah character 
        int charHealth = 100;

        // mendeklarasikan sebuah List yang menyimpan objek-objek dari kelas Blacksmith.Weapon
        // seperti memnbuat objek baru seperti biasanya, "Kelas - Nama Variabel = Methodnya"
        List<Blacksmith.Weapon> weapons = Blacksmith.createWeapons();

        // memanggil method dengan parameter weapons
        displayWeaponList(weapons);

        
        System.out.print("Choose the weapon by picking its number: ");

        // variabel input pemilihan senjata
        int weaponChoice = input.nextInt();

        // mendeklarasikan sebuah List yang menyimpan objek dari kelas Blacksmith.Armor
        List<Blacksmith.Armor> armors = Blacksmith.createArmors();

        // memanggil method dengan parameter armors
        displayArmorList(armors);

        System.out.print("Choose the armor by picking its number: ");

        // variabel input pemilihan armor
        int armorChoice = input.nextInt();

        // membuat pengkondisian untuk mengecek pilihan
        if (validPick(weaponChoice, weapons.size())) {
            System.out.println("You've chosen weapon number " + weaponChoice);
        } 

        // mendapatkan objek Blacksmith.Weapon dari list weapons berdasarkan pilihan kita (weaponChoice)
        Blacksmith.Weapon chosenWeapon = weapons.get(weaponChoice - 1);

        // membuat pengkondisian untuk mengecek pilihan
        if (validPick(armorChoice, armors.size())) {
            System.out.println("You've chosen armor number " + armorChoice);
        } 

        // mendapatkan objek Blacksmith.Weapon dari list weapons berdasarkan pilihan pengguna (weaponChoice)
        Blacksmith.Armor chosenArmor = armors.get(armorChoice - 1);

        // method akhir untuk menampilkan seluruh hasil pilihan, toUpperCase adalah method bawaan yang berguna
        // toUpperCase adalah method bawaan yang berguna untuk membuat kalimat menjadi kapital
        displayFinalChar(charName.toUpperCase(), charHealth, chosenWeapon, chosenArmor);

        // menutup close
        input.close();
    }

    // membuat deklarasi dari metode displayWeaponList, dengan parameter list "weapons" list dari objek file Blacksmith dan kelas Weapon
    public static void displayWeaponList(List<Blacksmith.Weapon> weapons) {
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" \n Now choose your weapon. Be Careful of what you will choose, slayer!!! \nHere are available weapons: \n");

        // ini adalah loop for yang akan digunakan untuk mengulang index yang menampilkan elemen
        for (int i = 0; i < weapons.size(); i++) {
            System.out.println((i + 1) + ". " + weapons.get(i));
        }
    }

    // membuat deklarasi dari metode displayArmorList, dengan parameter list "armors" list dari objek file Blacksmith dan kelas Armor
    public static void displayArmorList(List<Blacksmith.Armor> armors) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" \n Now choose your armor. Be Brave to choose the one that fits for you, slayer!!! \nHere are available armors: \n");

        // ini adalah loop for yang akan digunakan untuk mengulang index yang menampilkan elemen
        for (int i = 0; i < armors.size(); i++) {
            System.out.println((i + 1) + ". " + armors.get(i));
        }
    }

    // method untuk memeriksa pilihan senjata & armor
    public static boolean validPick(int choice, int size) {
        return choice >= 1 && choice <= size;
    }

    // method untuk menampilkan hasil akhir, seperti nama, darah, senjata pilihan kita, dan armor pilihan
    public static void displayFinalChar(String character, int health, Blacksmith.Weapon chosenWeapon, Blacksmith.Armor chosenArmor) {
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.println("\tCongratulations, Slayer! The choosing progress has been finished. Here are your final character details:\n");
        System.out.println(" > Name : " + character);
        System.out.println(" > Health : " + health + " HP");
        System.out.println("\n > Weapon : \n " + chosenWeapon);
        System.out.println("\n > Armor : \n" + chosenArmor);
        System.out.println("~~~~~~~~~~~~~~~~~\n");
    }
}
