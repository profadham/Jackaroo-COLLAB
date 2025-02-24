package model.player;
import model.Colour;
public class Marble {
    private Colour colour; //read only

    public Marble(Colour colour) {this.colour = colour;}

    public Colour getColour() {return this.colour;}
}
