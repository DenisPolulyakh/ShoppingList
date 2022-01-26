package com.android.shoppinglist.domain

interface ShopListRepository {
    fun addShopItem(shopItem: ShopItem)
    fun delete(shopItem: ShopItem)
    fun editShopItem(shopItem: ShopItem)
    fun getShopItem(shopItemId: Int):ShopItem
    fun getShopList():List<ShopItem>
}