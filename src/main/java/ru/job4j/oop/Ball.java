package ru.job4j.oop;

public class Ball {
    public void tryRun(boolean condition) {
        if (condition) {
            System.out.println("Колобок съеден");
        } else  {
            System.out.println("Колобок сбежал");
        }
    }

    public static class Hare {
        public void tryEat(Ball ball) {
            ball.tryRun(false);
        }
    }

    public static class Fox {
        public void tryEat(Ball ball) {
            ball.tryRun(true);
        }
    }

    public static class Wolf {
        public void tryEat(Ball ball) {
            ball.tryRun(false);
        }
    }

    public class BallStory {
        public static void main(String[] args) {
            Ball ball = new Ball();
            Hare hare = new Ball.Hare();
            Fox fox = new Ball.Fox();
            Wolf wolf = new Ball.Wolf();
            hare.tryEat(ball);
            fox.tryEat(ball);
            wolf.tryEat(ball);
        }
    }
}