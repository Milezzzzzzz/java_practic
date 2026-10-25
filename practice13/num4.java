package practice13;

public class num4 {
    public static void main(String[] args) {
        String[] shirts = {
                "S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL",
                "S007,White T-Shirt,White,XL",
                "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S"
        };

        Shirt[] shirtObjects = new Shirt[shirts.length];

        for (int i = 0; i < shirts.length; i++) {
            shirtObjects[i] = new Shirt(shirts[i]);
        }

        for (Shirt shirt : shirtObjects) {
            System.out.println(shirt);
        }
    }
}

class Shirt {
    private String id;
    private String description;
    private String color;
    private String size;

    public Shirt(String shirtString) {
        String[] parts = shirtString.split(",");
        this.id = parts[0];
        this.description = parts[1];
        this.color = parts[2];
        this.size = parts[3];
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "id='" + id + '\'' +
                ", desc='" + description + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}