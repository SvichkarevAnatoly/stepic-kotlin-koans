// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrders(): Set<Customer> =
        customers.filter {
            val (isDelivered, isNotDelivered) = it.orders.partition(Order::isDelivered)
            isNotDelivered.size > isDelivered.size
        }.toSet()
