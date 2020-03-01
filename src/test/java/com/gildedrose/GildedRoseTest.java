package com.gildedrose;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.assertThat;

public class GildedRoseTest {

    private static Object[][] testData() {
        return new Object[][] {
            {new Item("foo", 1, 5), "foo", 0, 4},
            {new Item("+5 Dexterity Vest", 10, 20), "+5 Dexterity Vest", 9, 19},
            {new Item("+5 Dexterity Vest", -1, 20), "+5 Dexterity Vest", -2, 18},
            {new Item("Aged Brie", 2, 0), "Aged Brie", 1, 1},
            {new Item("Aged Brie", -1, 0), "Aged Brie", -2, 2},
            {new Item("Elixir of the Mongoose", 5, 7), "Elixir of the Mongoose", 4, 6},
            {new Item("Sulfuras, Hand of Ragnaros", 0, 80), "Sulfuras, Hand of Ragnaros", 0, 80},
            {new Item("Sulfuras, Hand of Ragnaros", -1, 80), "Sulfuras, Hand of Ragnaros", -1, 80},
            {new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20), "Backstage passes to a TAFKAL80ETC concert", 14, 21},
            {new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49), "Backstage passes to a TAFKAL80ETC concert", 9, 50},
            {new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49), "Backstage passes to a TAFKAL80ETC concert", 4, 50},
            {new Item("Backstage passes to a TAFKAL80ETC concert", 1, 20), "Backstage passes to a TAFKAL80ETC concert", 0, 23},
            {new Item("Backstage passes to a TAFKAL80ETC concert", -1, 20), "Backstage passes to a TAFKAL80ETC concert", -2, 0},
        };
    }

    @ParameterizedTest
    @MethodSource("testData")
    public void foo(Item item, String name, int sellId, int quality) {
        Item[] items = new Item[] { item };
        GildedRose app = new GildedRose(items);
        app.update_quality();
        assertThat(app.items[0].name).isEqualTo(name);
        assertThat(app.items[0].sell_in).isEqualTo(sellId);
        assertThat(app.items[0].quality).isEqualTo(quality);
    }
}
