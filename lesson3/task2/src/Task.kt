// Return the set of cities the customers are from
fun Shop.getCitiesCustomersAreFrom(): Set<City> {
    val cities = mutableListOf<City>()
    this.customers.filter{cities.add(it.city)}
    return cities.toSet()
}

// Return a list of the customers who live in the given city
fun Shop.getCustomersFrom(city: City): List<Customer> {
    return this.customers.filter{it.city.name == city.name}
}
