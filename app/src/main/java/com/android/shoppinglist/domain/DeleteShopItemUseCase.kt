package com.android.shoppinglist.domain

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun delete(shopItem: ShopItem){
        shopListRepository.delete(shopItem)
    }
}