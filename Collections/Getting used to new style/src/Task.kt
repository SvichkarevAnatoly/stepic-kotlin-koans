fun doSomethingWithCollection(collection: Collection<String>): Collection<String>? {

    val groupsByLength = collection.groupBy(String::length)

    val maximumSizeOfGroup = groupsByLength.values.map { it.size }.max()

    return groupsByLength.values.firstOrNull { it.size == maximumSizeOfGroup }
}
