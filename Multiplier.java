package com.company;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Moltiplicatore extends Casella{
    public Moltiplicatore(String s){
        super(s);
        rect=new Rectangle(50,50, Color.GREEN);
        rect.setStroke(Color.BLACK);
    }

    @Override
    public void scopri() {
        sp.getChildren().remove(rect2);
        disabled=true;
        View.score.setText("PUNTEGGIO :"+ (View.punteggio *= 2));
        View.tries.setText("TENTATIVI :"+ --View.tentativi);
        GameOver(View.tentativi);
    }
}
