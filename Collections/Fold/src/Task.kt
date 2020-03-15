// Return the set of products that were ordered by all customers
fun Shop.getProductsOrderedByAll(): Set<Product> {
    val allProducts = customers.flatMap(Customer::getOrderedProducts).toSet()
    return customers.fold(allProducts, { allOrdered, customer ->
        allOrdered.intersect(customer.getOrderedProducts())
    })
}

fun Customer.getOrderedProducts(): List<Product> =
        orders.flatMap(Order::products)