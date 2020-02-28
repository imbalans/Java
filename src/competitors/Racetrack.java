package competitors;

public class Racetrack extends Obstacle{
    int distance;

    public Racetrack(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Competitors competitors) {
        competitors.run(distance);
    }
}
