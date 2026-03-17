package dev.alexrincon.testglobant.data

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class SearchRepository {

    fun search(query: String): Flow<List<String>> = flow {
        delay(500) // Simulate network delay

        val result = listOf(
            "$query Result 1",
            "$query Result 2",
            "$query Result 3"
        )

        emit(result)
    }
}
