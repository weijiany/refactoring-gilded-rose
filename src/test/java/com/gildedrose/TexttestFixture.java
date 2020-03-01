package com.gildedrose;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Item[] items = new Item[] {
                Item.createItem("+5 Dexterity Vest", 10, 20), //
                Item.createItem("Aged Brie", 2, 0), //
                Item.createItem("Elixir of the Mongoose", 5, 7), //
                Item.createItem("Sulfuras, Hand of Ragnaros", 0, 80), //
                Item.createItem("Sulfuras, Hand of Ragnaros", -1, 80),
                Item.createItem("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                Item.createItem("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                Item.createItem("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                Item.createItem("Backstage passes to a TAFKAL80ETC concert", 1, 20),
                // this conjured item does not work properly yet
                Item.createItem("Conjured Mana Cake", 3, 6)};

        GildedRose app = new GildedRose(items);

        int days = 3;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.update_quality();
        }
    }

}
