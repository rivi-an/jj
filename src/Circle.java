public class Circle {
    private double r, len;
    public void setRadius(double r)
    {
        this.r=r;
        len = 2*3.14*r;
    }
    public double getRadius()
    {
        return r;
    }
    public double getLen()
    {
        return len;
    }
}
