package ru.netology.nmedia.repository

import ru.netology.nmedia.dto.Post

interface PostRepository {
    fun getAll(): List<Post>
    fun removeById(id: Long, callback: GenericCallback<Post>)
    fun save(post: Post, callback: GenericCallback<Post>)
    fun likeById(post: Post, callback: GenericCallback<Post>)
    fun getAllAsync(callback: GenericCallback<List<Post>>)

    interface GenericCallback<T> {
        fun onSuccess(result: T) {}
        fun onError(e: Exception) {}
    }
}
