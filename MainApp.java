

package mygame;
import java.util.Scanner;
public class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Hero (Square/Circle): ");
        String choice = input.next();
        System.out.print("Enter Value: ");
        double val = input.nextDouble();
        GameHero hero = HeroFactory.createHero(choice, val);
        if (hero != null) {
            hero.playHeroSound();
            System.out.println("Power is: " + hero.calculatePower());
            System.out.println("BUILD SUCCESSFUL");
        } else { System.out.println("Hero not found!"); }
        input.close();
    }
}