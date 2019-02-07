package com.gildedrose;

public class GildedRoseItemFactory {

	GildedRoseItem createGildedRoseItem(Item item) {
		
		GildedRoseItem gildedRoseItem;
		if (item.name.equals(GildedRose.AGED_BRIE)) {
			gildedRoseItem = new AgedBrieItem(item);
		} else if (item.name.equals(GildedRose.BACKSTAGE_PASS)) {
			gildedRoseItem = new BackStagePassItem(item); 
		} else if (item.name.equals(GildedRose.SULFURAS)) {
			gildedRoseItem = new SulfurasItem(item);
		} else {
			gildedRoseItem = new NormalItem(item); 
		}
		return gildedRoseItem;
	}

}
