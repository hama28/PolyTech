public abstract class Figure {
    int height;
    int bottom;

    public void menseki(int height, int bottom) {
        this.height = height;
        this.bottom = bottom;
    }

    public abstract void area();

}