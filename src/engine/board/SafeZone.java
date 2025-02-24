package engine.board;
import model.Colour;

import java.util.ArrayList;

public class SafeZone {
    private final Colour colour; //read only
    private final ArrayList<Cell> cells; //read only
    public SafeZone(Colour colour) {
        this.colour = colour;
        this.cells = new ArrayList<>();
        for (int i = 0;i < 4; i++){
            this.cells.add(new Cell(CellType.SAFE));
        }
    }
    public Colour getColour() {return this.colour;}
    public ArrayList<Cell> getCells() {return this.cells;}
}
