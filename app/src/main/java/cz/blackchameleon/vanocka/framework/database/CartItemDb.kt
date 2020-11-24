package cz.blackchameleon.vanocka.framework.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import cz.blackchameleon.domain.CartItem

/**
 * @author Karolina Klepackova on 23.11.2020.
 */

@Entity(tableName = "cartItems")
class CartItemDb(
    id: String,
    name: String,
    title: String,
    thumbnail_image: String,
    @ColumnInfo(name = "amount")
    val amount: Int,
    price: Float,
    unit: String
) : ProductDb(
    id = id,
    name = name,
    title = title,
    thumbnail_image = thumbnail_image,
    price = price,
    unit = unit
) {
    fun toCartItem(): CartItem = CartItem(
        id = this.id,
        name = this.name,
        title = this.title,
        thumbnail_image = this.thumbnail_image,
        amount = this.amount,
        price = this.price,
        unit = this.unit
    )
}