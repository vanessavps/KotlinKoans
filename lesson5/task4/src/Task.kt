fun renderProductTable(): String {
    return html {
        table {
            tr (color = getTitleColor()){
                td {
                    text("Product")
                }
                td {
                    text("Price")
                }
                td {
                    text("Popularity")
                }
            }
            val products = getProducts()
            products.withIndex().forEach {item ->
                tr{
                    td(color = getCellColor(item.index,0)){
                        text(item.value.description)
                    }
                    td (color = getCellColor(item.index,1)){
                        text(item.value.price)
                    }
                    td (color = getCellColor(item.index,2)){
                        text(item.value.popularity)
                    }
                }
            }
        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, row: Int) = if ((index + row) %2 == 0) "#dce4ff" else "#eff2ff"
