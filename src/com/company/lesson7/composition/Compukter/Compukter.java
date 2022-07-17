package com.company.lesson7.composition.Compukter;

import java.util.Arrays;

public class Compukter {

    private double price;
    private GraphicCard graphicCard;
    private Chip chip;
    private Memory[] memory;

    @Override
    public String toString() {
        return "Compukter{" +
                "price=" + price +
                ", graphicCard=" + graphicCard +
                ", chip=" + chip +
                ", memory=" + Arrays.toString(memory) +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(GraphicCard graphicCard) {
        this.graphicCard = graphicCard;
    }

    public Chip getChip() {
        return chip;
    }

    public void setChip(Chip chip) {
        this.chip = chip;
    }

    public Memory[] getMemory() {
        return memory;
    }

    public void setMemory(Memory[] memory) {
        this.memory = memory;
    }

    public Compukter(double price, GraphicCard graphicCard, Chip chip, Memory[] memory) {
        this.price = price;
        this.graphicCard = graphicCard;
        this.chip = chip;
        this.memory = memory;
    }
}
