package com.bt.ptetrasos.components.game;

import com.artemis.Component;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Image component containing the Sprite of the entity.
 * <p>
 * There are several types of components:
 * <ul>
 * <li>Component - base component type. No methods included out of the box.</li>
 * <li>PooledComponent - recycled once removed from an entity. Can be specified using decorator @PooledWeaver</li>
 * <li>PackedComponent - components with zero argument constructors that only exist as a single instance
 * per ComponentMapper, along with one instance in the mapper itself.</li>
 * </ul>
 *
 * @see <a href="https://github.com/junkdog/artemis-odb/wiki/Component-Types">Component types</a>
 * <p>
 * Note that this is the standard component layout, including getters and setters for all private variables, to not
 * clutter the local namespace.
 */
public class Image extends Component {

    private Sprite image;
    private int layer;

    public Image() {}

    public Image(Texture texture) {
        this.image = image;
    }

    public int getLayer() {
        return layer;
    }

    public void setLayer(int layer) {
        this.layer = layer;
    }

    public void setImage(Sprite image) {
        this.image = image;
    }

    public Sprite getImage() {
        return image;
    }


}
