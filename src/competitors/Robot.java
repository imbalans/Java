package competitors;

public class Robot implements Competitors {
    String name;
    int maxRunDistance;
    int maxJumpHeight;
    boolean onDistance;

    public Robot(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }

    @Override
    public void run(int distance) {
        if(distance <= maxRunDistance){
            System.out.println(name + " пробежал дистанцию в " + distance + "м.");
        } else {
            System.out.println(name + " не пробежал дистанцию в " + distance + "м.");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if(height <= maxJumpHeight){
            System.out.println(name + " прыгнул на высоту - " + height);
        } else {
            System.out.println(name + " не смог прыгнуть на высоту - " + height);
            onDistance = false;
        }
    }

    @Override
    public boolean isDistance() {
        return onDistance;
    }
}
