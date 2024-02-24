package org.jukeboxmc.server.item.behavior

import org.jukeboxmc.api.item.ItemType

class ItemPorkchop(itemType: ItemType, countNetworkId: Boolean) : JukeboxItemFood(itemType, countNetworkId) {

    override fun getSaturation(): Float {
        return 1.8F
    }

    override fun getHunger(): Int {
        return 3
    }
}