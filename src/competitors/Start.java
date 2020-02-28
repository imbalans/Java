package competitors;

public class Start {
    public static void main(String[] args) {
        Competitors[] competitors =
                {new Human("Sasha", 900, 5),
                new Robot("Oleg", 950, 10),
                new Cat("Murzik", 1000, 5)};

        Obstacle[] obstacles = {new Racetrack(1000), new Wall(4)};

        for (Competitors c : competitors) {
            for (Obstacle o : obstacles) {
                o.doIt(c);
                if(!c.isDistance()){
                    break;
                }
            }
        }
    }
}