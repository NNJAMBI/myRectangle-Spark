public class Cube {
    private Rectangle mFace;

    public Cube(Rectangle rectangle) {
        mFace = rectangle;
    }

    public Rectangle getFace() {
        return mFace;
    }
    public int volume() {
        int height = mFace.getHeight();
        return height  * height * height;
    }

    public int surfaceArea() {
        return mFace.area * 6;
    }
}
