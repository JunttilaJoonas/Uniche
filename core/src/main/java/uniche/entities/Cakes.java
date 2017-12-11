package main.java.uniche.entities;

import com.badlogic.gdx.physics.box2d.*;
import main.java.uniche.utils.Skaalausta;

public class Cakes {

    public Body cake;
    public String id;

    public Cakes (World world, String id, float x, float y){
        this.id = id;
        createCake(world,x,y);

    }

    private void createCake(World world, float x, float y){
        BodyDef bdef = new BodyDef();
        bdef.fixedRotation =  true;
        bdef.type = BodyDef.BodyType.StaticBody;
        bdef.position.set(x,y);

        PolygonShape shape = new PolygonShape();
        shape.setAsBox(10 /2/ Skaalausta.Scaler,10 /2/ Skaalausta.Scaler);

        FixtureDef fixture = new FixtureDef();
        fixture.shape = shape;
        fixture.density = 1.0f;

        this.cake = world.createBody(bdef);
        this.cake.createFixture(fixture).setUserData(this);
    }

    public void poimittu (){
        System.out.println("Poimittu");
    }
}
