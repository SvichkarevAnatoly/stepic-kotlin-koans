// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrders(): Set<Customer> =
        customers.partition {
            it.orders.filter { order -> !order.isDelivered }.size >
                    it.orders.filter { order -> order.isDelivered }.size
        }.first.toSet()
