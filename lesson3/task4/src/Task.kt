// Return all products this customer has ordered
fun Customer.getOrderedProducts(): Set<Product> = this.orders.flatMap {it.products}.toSet()

// Return all products that were ordered by at least one customer
fun Shop.getAllOrderedProducts(): Set<Product> {
    val products = mutableListOf<Product>()
    this.customers.filter { products.addAll(it.getOrderedProducts()) }
    return products.toSet()
}
