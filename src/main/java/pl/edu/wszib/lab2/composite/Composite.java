package pl.edu.wszib.lab2.composite;

import java.util.Collections;
import java.util.List;

public class Composite implements Component {

    private final List<Component> components;

    public Composite(final List<Component> components) {
        this.components = Collections.unmodifiableList(components);
    }

    @Override
    public void operation() {
        components.forEach(Component::operation);
    }
}
