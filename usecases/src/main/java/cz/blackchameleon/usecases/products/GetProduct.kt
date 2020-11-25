package cz.blackchameleon.usecases.products

import cz.blackchameleon.data.LocalResult
import cz.blackchameleon.data.repository.ProductRepository
import cz.blackchameleon.domain.Product

/**
 * @author Karolina Klepackova on 24.11.2020.
 */
class GetProduct(
    private val productRepository: ProductRepository
) {
    suspend operator fun invoke(id: String): LocalResult<Product> = productRepository.getProduct(id)
}