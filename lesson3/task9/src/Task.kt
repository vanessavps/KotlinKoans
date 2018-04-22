// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> = this.customers.filter {
    val (delivered, notDelivered) = it.orders.partition { it.isDelivered }
    notDelivered.count() > delivered.count()
}.toSet()
