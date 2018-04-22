// Return true if all customers are from the given city
fun Shop.checkAllCustomersAreFrom(city: City): Boolean {
    val isFromCity:(Customer) -> Boolean = {it.city == city}
    return this.customers.all(isFromCity)
}

// Return true if there is at least one customer from the given city
fun Shop.hasCustomerFrom(city: City): Boolean {
    val isFromCity:(Customer) -> Boolean = {it.city == city}
    return this.customers.any(isFromCity)
}

// Return the number of customers from the given city
fun Shop.countCustomersFrom(city: City): Int {
    val isFromCity:(Customer) -> Boolean = {it.city == city}
    return this.customers.count(isFromCity)
}

// Return a customer who lives in the given city, or null if there is none
fun Shop.findAnyCustomerFrom(city: City): Customer?  {
    val isFromCity:(Customer) -> Boolean = {it.city == city}
    return this.customers.find(isFromCity)

}
