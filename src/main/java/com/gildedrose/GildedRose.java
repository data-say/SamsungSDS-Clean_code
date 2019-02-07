package com.gildedrose;

class GildedRose {
	static final String BACKSTAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";
	static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
	static final String AGED_BRIE = "Aged Brie";
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
		GildedRoseItem gildedRoseItem = GildedRoseItemFactory.getInstance().createGildedRoseItem(item);
		gildedRoseItem.updateQuality();
	}
}
