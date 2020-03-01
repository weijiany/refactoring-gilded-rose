package com.gildedrose;

public class AgedBrie extends Item {
    public AgedBrie(int sell_in, int quality) {
        super("Aged Brie", sell_in, quality);
    }

    @Override
    void doUpdate() {
        if (quality < 50) {
            quality = quality + 1;

        }

        sell_in = sell_in - 1;

        if (sell_in < 0 && quality < 50) {
            quality = quality + 1;
        }
    }
}
