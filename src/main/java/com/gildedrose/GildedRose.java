package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void update_quality() {
        for (Item item : items) {
            switch (item.name) {
                case "Aged Brie":
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;

                    }

                    item.sell_in = item.sell_in - 1;

                    if (item.sell_in < 0 && item.quality < 50) {
                        item.quality = item.quality + 1;
                    }
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;

                        if (item.sell_in < 11 && item.quality < 50) {
                            item.quality = item.quality + 1;
                        }

                        if (item.sell_in < 6 && item.quality < 50) {
                            item.quality = item.quality + 1;
                        }
                    }

                    item.sell_in = item.sell_in - 1;

                    if (item.sell_in < 0) {
                        item.quality = 0;
                    }
                    break;
                case "Sulfuras, Hand of Ragnaros":

                    break;
                default:
                    if (item.quality > 0) {
                        item.quality = item.quality - 1;
                    }

                    item.sell_in = item.sell_in - 1;

                    if (item.sell_in < 0 && item.quality > 0) {
                        item.quality = item.quality - 1;
                    }
                    break;
            }
        }
    }

}
