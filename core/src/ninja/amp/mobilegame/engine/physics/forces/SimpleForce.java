package ninja.amp.mobilegame.engine.physics.forces;

import com.badlogic.gdx.math.Vector2;
import ninja.amp.mobilegame.objects.Entity;

public class SimpleForce extends Force {

    public static Force GRAVITY = new SimpleForce(new Vector2(0, -30));

    private Vector2 force;
    private Vector2 vector = new Vector2();

    public SimpleForce(Vector2 force) {
        this.force = force;
    }

    @Override
    public Vector2 calculate(Entity entity, float delta) {
        return vector.set(force);
    }

}
