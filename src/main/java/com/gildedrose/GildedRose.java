package com.gildedrose;

class GildedRose {
	private static final String BACKSTAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";
	private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
	private static final String AGED_BRIE = "Aged Brie";
	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		for (int i = 0; i < items.length; i++) {
			Item item = items[i];
			updateQuality(item);
			updateSellIn(item);
		}
	}

	private void updateSellIn(Item item) {
		if (item.name.equals(SULFURAS)) {
		} else {
			item.sellIn = item.sellIn - 1;
		}
	}

	private void updateQuality(Item item) {
		GildedRoseItemFactory gildedRoseItemFactory= new GildedRoseItemFactory(); 
		GildedRoseItem gildedRoseItem = createGildedRoseItem(item);
		gildedRoseItem.updateQuality();
	}

	private GildedRoseItem createGildedRoseItem(Item item) {
		GildedRoseItem gildedRoseItem;
		if (item.name.equals(AGED_BRIE)) {
			gildedRoseItem = new AgedBrieItem(item);
		} else if (item.name.equals(BACKSTAGE_PASS)) {
			gildedRoseItem = new BackStagePassItem(item); 
		} else if (item.name.equals(SULFURAS)) {
			gildedRoseItem = new SulfurasItem(item);
		} else {
			gildedRoseItem = new NormalItem(item); 
		}
		return gildedRoseItem;
	}
}
