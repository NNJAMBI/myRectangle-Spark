import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by staff on 7/10/17.
 */
public class Rectangle {
    public int area;
    private int height;
    private int width;
    private static ArrayList<Rectangle> Instances = new ArrayList<Rectangle>();
    private Boolean shape;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
        this.shape = isRectSquare();
        this.area = area();
        Instances.add(this);
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
    public static ArrayList<Rectangle> all() {
        return Instances;
    }

    public int area() {
        return height * width;
    }


    public boolean getShape(){
        return shape;
    }

    public boolean isRectSquare(){
        if (height == width){
            return true;
        }
        else {
            return false;
        }
    }

}
