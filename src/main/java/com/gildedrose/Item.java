package com.gildedrose;

public class Item {

    private static final String AGED_BRIE = "Aged Brie";
    private static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    public String name;
    public int sell_in;
    public int quality;

    Item(String name, int sell_in, int quality) {
        this.name = name;
        this.sell_in = sell_in;
        this.quality = quality;
    }

    public static Item createItem(String name, int sell_in, int quality) {
        switch (name) {
            case AGED_BRIE:
                return new AgedBrie(sell_in, quality);
            case BACKSTAGE:
                return new BackstagePasses(sell_in, quality);
            case SULFURAS:
                return new Sulfuras(sell_in, quality);
            default:
                return new Item(name, sell_in, quality);
        }
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sell_in + ", " + this.quality;
    }

    public void doUpdate() {
        if (quality > 0) {
            quality = quality - 1;
        }

        sell_in = sell_in - 1;

        if (sell_in < 0 && quality > 0) {
            quality = quality - 1;
        }
    }
}
