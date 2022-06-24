package model.heroes;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Hero Human = new Human();
        Hero Elf = new Elf();
        Hero Dwarf = new Dwarf();
        Hero Rogue = new Rogue();
        System.out.println("Wbyierz rase: 1. czlowiek, 2. elf, 3. krasnolud, 4. lotrzyk\n");
        Scanner choice = new Scanner(System.in);
        int input = choice.nextInt();
        switch (input)
        {
            case 1:
                System.out.println("Wybrano ludzia, Abilitki: ");
                System.out.println(Human.abilities());
                break;
            case 2:
                System.out.println("Wybrano elfa, Abilitki: ");
                System.out.println(Elf.abilities());
                break;
            case 3:
                System.out.println("Wybrano krasnoluda, Abilitki: ");
                System.out.println(Dwarf.abilities());
                break;
            case 4:
                System.out.println("Wybrano lotrzyka, Abilitki: ");
                System.out.println(Rogue.abilities());
                break;
            default:
                System.out.println("Blad wyboru rasy");
                break;
        }
        Hero PlaceHolder = new Empty();
        Hero Warrior = new Warrior(PlaceHolder);
        Hero Mage = new Mage(PlaceHolder);
        Hero Assassin = new Assassin(PlaceHolder);
        Hero Armourer = new Armourer(PlaceHolder);
        Hero Hunter = new Hunter(PlaceHolder);
        System.out.println("Wybierz klase postaci: 1. wojownik, 2. mag, 3. zabojca, 4. zbrojmistrz, 5. lowca");
        Scanner choice2 = new Scanner(System.in);
        int input2 = choice2.nextInt();
        switch (input2)
        {
            case 1:
                System.out.println("Wybrano wojownika, ");
                System.out.println(Warrior.abilities());
                break;
            case 2:
                System.out.println("Wybrano maga, ");
                System.out.println(Mage.abilities());
                break;
            case 3:
                System.out.println("Wybrano zabojce, ");
                System.out.println(Assassin.abilities());
                break;
            case 4:
                System.out.println("Wybrano zbrojmistrza, ");
                System.out.println(Armourer.abilities());
                break;
            case 5:
                System.out.println("Wybrano lowce, ");
                System.out.println(Hunter.abilities());
                break;
            default:
                System.out.println("Blad wyboru klasy");
                break;
        }
    }
}
