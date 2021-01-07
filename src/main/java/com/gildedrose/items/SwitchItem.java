package com.gildedrose.items;

import com.gildedrose.core.Item;

public class SwitchItem extends Item {
    public SwitchItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        int kwaliteit=0;
        if (this.sellIn <=50) {
            kwaliteit = kwaliteit+1;
        }
        else kwaliteit=50;
    }
    public void updateQuality2() {
        int kwaliteit=0;
        if (this.sellIn <=0) {
            kwaliteit = kwaliteit-1;
        }
        else kwaliteit=0;
    }
}
