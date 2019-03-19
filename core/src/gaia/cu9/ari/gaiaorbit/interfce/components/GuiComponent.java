package gaia.cu9.ari.gaiaorbit.interfce.components;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

/** 
 * A GUI component
 * @author Toni Sagrista
 *
 */
public abstract class GuiComponent {

    protected Actor component;
    protected Skin skin;
    protected Stage stage;

    public GuiComponent(Skin skin, Stage stage) {
        this.skin = skin;
        this.stage = stage;
    }

    /**
     * Initialises the component
     */
    public abstract void initialize();

    public Actor getActor() {
        return component;
    }

    /**
     * Disposes the component
     */
    public abstract void dispose();
}
