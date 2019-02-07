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
			if (item.name.equals(AGED_BRIE)) {
				GildedRoseItem gildedRoseItem= new AgedBrieItem(item);
				gildedRoseItem.updateQuality();
			} else if (item.name.equals(BACKSTAGE_PASS)) {
				GildedRoseItem gildedRoseItem= new BackStagePassItem(item); 
				gildedRoseItem.updateQuality();
			} else if (item.name.equals(SULFURAS)) {
				GildedRoseItem gildedRoseItem= new SulfurasItem(item);
				gildedRoseItem.updateQuality(); 
			} else {
				GildedRoseItem gildedRoseItem= new NormalItem(item); 
				gildedRoseItem.updateQuality();
			}

			if (item.name.equals(SULFURAS)) {
			} else {
				item.sellIn = item.sellIn - 1;
			}
		}
	}
}
