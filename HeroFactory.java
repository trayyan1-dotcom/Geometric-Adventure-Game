
package mygame;
public class HeroFactory {
    public static GameHero createHero(String type, double value) {
        if (type.equalsIgnoreCase("Square")) return new SquareHero(value);
        if (type.equalsIgnoreCase("Circle")) return new CircleHero(value);
        return null;
    }
}