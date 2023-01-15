package pl.edu.wszib.lab2.composite;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Leaf leaf1 = new Leaf();
        Leaf leaf2 = new Leaf();
        Leaf leaf3 = new Leaf();
        Leaf leaf4 = new Leaf();
        Composite composite = new Composite(List.of(leaf1, leaf2, leaf3, leaf4));
        useOperation(composite);
    }

    private static void useOperation(Component component) {
        component.operation();
    }
}
