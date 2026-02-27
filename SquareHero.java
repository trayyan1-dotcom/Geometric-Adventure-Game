
package mygame;
public class SquareHero implements GameHero {
    private double side;
    public SquareHero(double side) { this.side = side; }
    @Override public void playHeroSound() { System.out.println(">>> Square Stomp Sound!"); }
    @Override public double calculatePower() { return side * side; }
}