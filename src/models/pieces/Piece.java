package models.pieces;

import enums.Color;
import interfaces.RuleSet;

public abstract class Piece implements RuleSet {
    private Color color;
    private boolean isActive;

    public Piece(Color color, boolean isActive) {
        this.color = color;
        this.isActive = isActive;
    }


    public Color getColor() {
        return color;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
