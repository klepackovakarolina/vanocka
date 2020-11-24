package cz.blackchameleon.vanocka.framework

import cz.blackchameleon.domain.Product
import retrofit2.http.GET

/**
 * @author Karolina Klepackova on 23.11.2020.
 */

interface ProductApi {

    // Returns product by id
    @GET("/products/{id}")
    suspend fun getProduct(): Product
}