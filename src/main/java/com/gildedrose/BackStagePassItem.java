package com.gildedrose;

public class BackStagePassItem {

	private Item item;
	
	public BackStagePassItem(Item item) {
		this.item= item;
	}

	void updateQualityForBackstagePass() {
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