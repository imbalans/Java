package competitors;

public class Wall extends Obstacle {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitors competitors) {
        competitors.jump(height);
    }
}
