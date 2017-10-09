package come.wordpress.share2study.listviewadvence;

/**
 * Created by thela on 10/9/2017.
 */

public class Fruit {
    private String name;
    private String describe;
    private int image;

    public Fruit(String name, String describe, int image) {
        this.name = name;
        this.describe = describe;
        this.image = image;
    }

    public Fruit() {
    }

    public String getName() {
        return name;
    }

    public String getDescribe() {
        return describe;
    }

    public int getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
