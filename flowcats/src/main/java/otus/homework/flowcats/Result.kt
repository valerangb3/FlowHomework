package otus.homework.flowcats

sealed interface Result<out T> {
    object Idle : Result<Nothing>
    data class Success<out T>(val data: T): Result<T>
    data class Error(val message: String): Result<Nothing>
}