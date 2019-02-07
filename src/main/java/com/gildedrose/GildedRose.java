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
				updateQualityForBackstagePass(backStagePassItem, item);
			} else if (item.name.equals(SULFURAS)) {
				updateQualityForSulfuras(item); 
			} else {
				updateQualityForNormal(item);
			}

			if (item.name.equals(SULFURAS)) {
			} else {
				item.sellIn = item.sellIn - 1;
			}
		}
	}

	private void updateQualityForNormal(Item item) {
		if (item.quality > 0) {
			item.quality = item.quality - 1;
		}
		
		if (item.sellIn < 1) {
			if (item.quality > 0) {
				item.quality = item.quality - 1;
			}
		}
	}

	private void updateQualityForSulfuras(Item item) {
	}

	private void updateQualityForBackstagePass(BackStagePassItem backStagePassItem, Item item) {
		if (item.quality < 50) {
			item.quality = item.quality + 1;

			if (item.sellIn < 11) {
				item.quality = item.quality + 1;
			}

			if (item.sellIn < 6) {
				item.quality = item.quality + 1;
			}
		}
		
		if (item.sellIn < 1) {
			item.quality = item.quality - item.quality;
		}
	}
}
