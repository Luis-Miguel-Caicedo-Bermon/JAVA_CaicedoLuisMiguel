
package dia16;
 //se utiliza para minimizar el uso de memoria y mejorar el rendimiento
// al compartir objetos pequeños que se utilizan de manera repetida.

// busca reutilizar objetos en ves de crear nuevos cada que son nesesarios
import java.util.HashMap;
import java.util.Map;

// Clase Flyweight que representa la parte compartida
class TreeType {
    private String name;
    private String color;
    
    public TreeType(String name, String color) {
        this.name = name;
        this.color = color;
    }
    
    public void draw(int x, int y) {
        System.out.println("Dibujando un " + name + " de color " + color + " en (" + x + ", " + y + ")");
    }
}

// Fábrica que gestiona los objetos compartidos
class TreeFactory {
    private static Map<String, TreeType> treeTypes = new HashMap<>();
    
    public static TreeType getTreeType(String name, String color) {
        String key = name + "_" + color;
        treeTypes.putIfAbsent(key, new TreeType(name, color));
        return treeTypes.get(key);
    }
}

// Clase que representa un árbol individual con su posición
class Tree {
    private int x, y;
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw() {
        type.draw(x, y);
    }
}

// Uso del patrón Flyweight
public class flyweight {
    public static void main(String[] args) {
        TreeType oak = TreeFactory.getTreeType("Roble", "Verde");
        TreeType pine = TreeFactory.getTreeType("Pino", "Verde Oscuro");

        Tree tree1 = new Tree(10, 20, oak);
        Tree tree2 = new Tree(15, 25, oak);
        Tree tree3 = new Tree(30, 40, pine);

        tree1.draw();
        tree2.draw();
        tree3.draw();
    }
}
