package com.alejandro.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Enemigo {
    Texture texture = new Texture("alien.png");
    float x, y, w, h, vx, vy;
    Temporizador cambioVelocidad = new Temporizador(60);

    Animacion animacion = new Animacion(10,
            new Texture("alien.png"),
            new Texture("nave.png")
    );

    Enemigo() {
        x = 640;
        y = Utils.random.nextInt(480);
        w = 64 * 2;
        h = 48 * 2;
        vx = -2;
        vy = 0;
    }

    public void update() {
        y += vy;
        x += vx;

        if (cambioVelocidad.suena()) {
            vy = Utils.random.nextInt(6) - 3;
            vx = -(Utils.random.nextInt(3)+1);
        }
        if(x<0) x = 0;
        if(x > 540 + w) x = 540 + w;
        if(y > 428 + h) y = 428 + h;
    }

    void render(SpriteBatch batch) {
        batch.draw(texture, x, y, w, h);
    }
}
