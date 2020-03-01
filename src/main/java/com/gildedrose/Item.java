package com.gildedrose;

public class Item {

    public String name;

    public int sell_in;

    public int quality;

    public Item(String name, int sell_in, int quality) {
        this.name = name;
        this.sell_in = sell_in;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sell_in + ", " + this.quality;
    }

    void doUpdate() {
        switch (name) {
            case "Aged Brie":
                if (quality < 50) {
                    quality = quality + 1;

                }

                sell_in = sell_in - 1;

                if (sell_in < 0 && quality < 50) {
                    quality = quality + 1;
                }
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                if (quality < 50) {
                    quality = quality + 1;

                    if (sell_in < 11 && quality < 50) {
                        quality = quality + 1;
                    }

                    if (sell_in < 6 && quality < 50) {
                        quality = quality + 1;
                    }
                }

                sell_in = sell_in - 1;

                if (sell_in < 0) {
                    quality = 0;
                }
                break;
            case "Sulfuras, Hand of Ragnaros":

                break;
            default:
                if (quality > 0) {
                    quality = quality - 1;
                }

                sell_in = sell_in - 1;

                if (sell_in < 0 && quality > 0) {
                    quality = quality - 1;
                }
                break;
        }
    }
}
