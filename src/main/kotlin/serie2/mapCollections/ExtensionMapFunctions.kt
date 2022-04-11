package serie2.mapCollections

fun <K, V, R> HashMap<K, V>.map(transform:(MutableMap.MutableEntry <K,V>)->R): List<R> {
    TODO("Not yet implemented")
}

fun <K, V, R> HashMap<K, V>.filter(predicate:(MutableMap.MutableEntry<K,V>)->Boolean): List<MutableMap.MutableEntry<K,V>> {
    TODO("Not yet implemented")
}