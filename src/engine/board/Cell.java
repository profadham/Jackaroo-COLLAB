package engine.board;

import model.player.Marble;

public class Cell {
    private Marble marble;
    private CellType cellType;
    private boolean trap;

    public Cell(CellType cellType){
        this.cellType = cellType;
        this.marble = null;
        this.trap = false;
    }

    public Marble getMarble() {
        return this.marble;
    }
    public CellType getCellType() {
        return this.cellType;
    }
    public boolean isTrap() {
        return this.trap;
    }
    public void setMarble(Marble marble) {
        this.marble = marble;
    }
    public void setCellType(CellType cellType) {
        this.cellType = cellType;
    }
    public void setTrap(boolean trap) {
        this.trap = trap;
    }

}
