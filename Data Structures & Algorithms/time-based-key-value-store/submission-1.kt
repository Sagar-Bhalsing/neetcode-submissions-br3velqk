class TimeMap() {
    private val keyStore = HashMap<String, HashMap<Int, MutableList<String>>>()

    fun set(key: String, value: String, timestamp: Int) {
        if (!keyStore.containsKey(key)) {
            keyStore[key] = HashMap()
        }
        if (!keyStore[key]!!.containsKey(timestamp)) {
            keyStore[key]!![timestamp] = mutableListOf()
        }
        keyStore[key]!![timestamp]!!.add(value)
    }

    fun get(key: String, timestamp: Int): String {
        if (!keyStore.containsKey(key)) {
            return ""
        }

        var seen = 0
        for (time in keyStore[key]!!.keys) {
            if (time <= timestamp) {
                seen = maxOf(seen, time)
            }
        }

        if (seen == 0) {
            return ""
        }
        return keyStore[key]!![seen]!!.last()
    }
}