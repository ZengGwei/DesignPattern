package pattern.factory;

/**
 * 〈儿童玩具〉
 *
 * @author gw.Zeng
 * @create 2018/6/16
 * @since 1.0.0
 */
public class ChildrensToys {

    private double width;

    private double length;

    private double height;

    private String color;

    private double weight;


    public ChildrensToys() {}

    public ChildrensToys(double width, double length, double height, String color, double weight) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.color = color;
        this.weight = weight;
    }


    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "ChildrensToys{" +
                "width=" + width +
                ", length=" + length +
                ", height=" + height +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
