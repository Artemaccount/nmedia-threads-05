package ru.netology.nmedia.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import ru.netology.nmedia.dto.Post

@Entity
data class PostEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val authorAvatar: String,
    val author: String,
    val content: String,
    val published: String,
    val likedByMe: Boolean,
    val likes: Int = 0,
) {
    fun toDto() = Post(id, authorAvatar, author, content, published, likedByMe, likes)

    companion object {
        fun fromDto(dto: Post) =
            PostEntity(dto.id,dto.authorAvatar, dto.author, dto.content, dto.published, dto.likedByMe, dto.likes)

    }
}

