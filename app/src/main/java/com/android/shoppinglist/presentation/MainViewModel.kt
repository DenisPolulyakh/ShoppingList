package com.android.shoppinglist.presentation

import androidx.lifecycle.ViewModel
import com.android.shoppinglist.data.ShopListRepositoryImpl
import com.android.shoppinglist.domain.DeleteShopItemUseCase
import com.android.shoppinglist.domain.EditShopItemUseCase
import com.android.shoppinglist.domain.GetShopListUseCase
import com.android.shoppinglist.domain.ShopItem

class MainViewModel : ViewModel() {

    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopListUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShopList()


    fun deleteShopItem(shopItem: ShopItem) {
        deleteShopListUseCase.delete(shopItem)
    }

    fun changeEnableState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
    }
}