package uzaygemisi;
import java.util.Random;

public class Missile extends Sprite {

    Random rnd = new Random();
    private final int BOARD_WIDTH = 390;
    int a = rnd.nextInt(30)+1;
    int b = rnd.nextInt(25)+1;
    private int MISSILE_SPEED_X = a;
    private int MISSILE_SPEED_Y = b;
    boolean kontrolX, kontrolY = true;

    public Missile(int x, int y) {
        super(x, y);
        initMissile();
    }
    private void initMissile(){
        loadImage("C:/Users/asus/Desktop/resources/missile.png");
        getImageDimensions();
    }
    public void move(){
        if(MISSILE_SPEED_X > 0){
            kontrolX = true;
        }
        if(kontrolY){
            MISSILE_SPEED_Y = MISSILE_SPEED_Y + 1;
        }
        if(kontrolX){
            MISSILE_SPEED_X = MISSILE_SPEED_X - 1;

        }
        if(MISSILE_SPEED_X <= 0){
            MISSILE_SPEED_X = 0;
        }
        x += MISSILE_SPEED_X;
        y += MISSILE_SPEED_Y;
        if(x > BOARD_WIDTH){
            visible = false;
        }
    }
}

