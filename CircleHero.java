
package mygame;
public class CircleHero implements GameHero {
    private double radius;
    public CircleHero(double radius) { this.radius = radius; }
    @Override public void playHeroSound() { System.out.println(">>> Circle Whoosh Sound!"); }
    @Override public double calculatePower() { return Math.PI * radius * radius; }
}
