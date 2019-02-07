package com.gildedrose;

public class BackStagePassItem extends GildedRoseItem {

	public BackStagePassItem(Item item) {
		super(item);
	}

	@Override
	public void updateQuality() {
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