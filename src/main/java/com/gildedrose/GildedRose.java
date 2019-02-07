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
				AgedBrieItem agedBrieItem= new AgedBrieItem(item);
				agedBrieItem.updateQualityForAgedBrie();
			} else if (item.name.equals(BACKSTAGE_PASS)) {
				BackStagePassItem backStagePassItem= new BackStagePassItem(item); 
				backStagePassItem.updateQualityForBackstagePass();
			} else if (item.name.equals(SULFURAS)) {
				SulfurasItem sulfurasItem= new SulfurasItem(item);
				sulfurasItem.updateQualityForSulfuras(); 
			} else {
				NormalItem normalItem= new NormalItem(item); 
				normalItem.updateQualityForNormal(this, item);
			}

			if (item.name.equals(SULFURAS)) {
			} else {
				item.sellIn = item.sellIn - 1;
			}
		}
	}
}
