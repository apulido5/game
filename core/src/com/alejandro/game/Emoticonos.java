package com.alejandro.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Emoticonos {

    Texture texture = new Texture("corazon.png");
    Texture texture2 = new Texture("explosion.png");

    public void render(SpriteBatch batch){
        batch.draw(texture, 572, 405, 50, 50);
        batch.draw(texture2, 58, 410, 42, 35);
    }
}
