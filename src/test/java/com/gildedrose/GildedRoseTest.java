package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GildedRoseTest {

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 1, 5) };
        GildedRose app = new GildedRose(items);
        app.update_quality();
        assertThat("foo").isEqualTo(app.items[0].name);
        assertThat(app.items[0].quality).isEqualTo(4);
        assertThat(app.items[0].sell_in).isEqualTo(0);
    }
}
