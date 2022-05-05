package asteroids;
 
import javafx.application.Application;
import javafx.animation.AnimationTimer;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.concurrent.atomic.AtomicInteger;
 
public class AsteroidsApplication extends Application {
 
    public static int width = 400;
    public static int height = 300;
    private Pane pane = new Pane();
    private Text text = new Text(10, 20, "Points: 0");
    private Ship ship = new Ship(width / 2, height / 2);
    private List<Asteroid> asteroids = new ArrayList<>();
    private List<Projectile> projectiles = new ArrayList<>();
    Map<KeyCode, Boolean> pressedKeys = new HashMap<>();
    Color red = Color.RED;
    Color black = Color.BLACK;
    Color yellow = Color.YELLOW;
    Color white = Color.WHITE;
 
    @Override
    public void start(Stage stage) throws Exception {
        text.setFill(white);
        ship.setColor(red);
 
        pane.getChildren().add(text);
        pane.setPrefSize(width, height);
        pane.setStyle("-fx-background-color: black;");
        Scene scene = new Scene(pane);
 
        AtomicInteger points = new AtomicInteger();
 
        addShip();
        addAsteroids();
 
        scene.setOnKeyPressed(event -> {
            pressedKeys.put(event.getCode(), Boolean.TRUE);
        });
 
        scene.setOnKeyReleased(event -> {
            pressedKeys.put(event.getCode(), Boolean.FALSE);
        });
 
        new AnimationTimer() {
 
            @Override
            public void handle(long now) {
 
                shipMovements();
                ship.move();
                asteroids.forEach(asteroid -> asteroid.move());
                projectiles.forEach(projectile -> projectile.move());
 
                asteroids.forEach(asteroid -> {
                    if (ship.collide(asteroid)) {
                        ship.setMovement(Point2D.ZERO);
                        stop();
                        reset();
                        start();
                    }
                });
 
                projectiles.forEach(projectile -> {
                    asteroids.forEach(asteroid -> {
                        if (projectile.collide(asteroid)) {
                            projectile.setAlive(false);
                            asteroid.setAlive(false);
                        }
                    });
                    if ((!projectile.isAlive()) && ship.getCollidedStatus() == false) {
                        text.setText("Points: " + points.addAndGet(1000));
                    }
                });
 
                projectiles.stream()
                        .filter(projectile -> !projectile.isAlive())
                        .forEach(projectile -> pane.getChildren().remove(projectile.getCharacter()));
                projectiles.removeAll(projectiles.stream()
                        .filter(projectile -> !projectile.isAlive())
                        .collect(Collectors.toList()));
 
                asteroids.stream()
                        .filter(asteroid -> !asteroid.isAlive())
                        .forEach(asteroid -> pane.getChildren().remove(asteroid.getCharacter()));
                asteroids.removeAll(asteroids.stream()
                        .filter(asteroid -> !asteroid.isAlive())
                        .collect(Collectors.toList()));
 
                if (Math.random() < 0.007) {
                    generateAsteroids();
                }
            }
        }.start();
 
        stage.setTitle("Asteroids!");
        stage.setScene(scene);
        stage.show();
    }
 
    public void reset() {
        Button resetButton = new Button("Play again?");
        resetButton.relocate(160, 130);
        pane.getChildren().add(resetButton);
 
        resetButton.setOnMouseClicked(event -> {
            asteroids.stream()
                    .forEach(rock -> pane.getChildren().remove(rock.getCharacter()));
            projectiles.stream()
                    .forEach(missile -> pane.getChildren().remove(missile.getCharacter()));
 
            projectiles.clear();
            asteroids.clear();
 
            pane.getChildren().removeAll(ship.getCharacter(), resetButton);
            pane.getChildren().clear();
 
            addShip();
            ship.setCollidedStatus(false);
            addAsteroids();
 
            text.setText("Points: 0");
            pane.getChildren().add(text);
        });
    }
 
    public void addShip() {
        ship.setMovement(new Point2D(0, 0));
        ship.resetPosition(width / 2, height / 2);
 
        pane.getChildren().add(ship.getCharacter());
    }
 
    public void addAsteroids() {
        if (ship.getCollidedStatus() == false) {
            for (int i = 0; i < 5; ++i) {
                Random random = new Random();
                Asteroid asteroid = new Asteroid(random.nextInt(width / 3), random.nextInt(height));
                asteroid.setColor(white);
                asteroids.add(asteroid);
            }
            asteroids.forEach(asteroid -> pane.getChildren().add(asteroid.getCharacter()));
        }
    }
 
    public void generateAsteroids() {
        Asteroid asteroid = new Asteroid(width, height);
        asteroid.setColor(white);
        if (!asteroid.collide(ship)) {
            asteroids.add(asteroid);
            pane.getChildren().add(asteroid.getCharacter());
        }
    }
 
    public void shipMovements() {
        if (pressedKeys.getOrDefault(KeyCode.LEFT, false)) {
            ship.turnLeft();
        }
 
        if (pressedKeys.getOrDefault(KeyCode.RIGHT, false)) {
            ship.turnRight();
        }
 
        if (pressedKeys.getOrDefault(KeyCode.UP, false)) {
            ship.accelerate();
        }
 
        if (pressedKeys.getOrDefault(KeyCode.SPACE, false) && projectiles.size() < 3) {
 
            Projectile projectile = new Projectile((int) ship.getCharacter().getTranslateX(), (int) ship.getCharacter().getTranslateY());
            projectile.getCharacter().setRotate(ship.getCharacter().getRotate());
            projectile.setColor(yellow);
            projectiles.add(projectile);
 
            projectile.accelerate();
            projectile.setMovement(projectile.getMovement().normalize().multiply(3));
 
            pane.getChildren().add(projectile.getCharacter());
        }
    }
 
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        launch(args);
    }
 
    public static int partsCompleted() {
        // State how many parts you have completed using the return value of this method
        return 4;
    }
 
}