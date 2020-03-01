package com.gildedrose;

public class BackstagePasses extends Item {
    public BackstagePasses(int sell_in, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sell_in, quality);
    }

    @Override
    public void doUpdate() {
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
    }
}
