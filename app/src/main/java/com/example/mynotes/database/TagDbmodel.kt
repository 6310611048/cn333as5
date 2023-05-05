package com.example.mynotes.database
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TagDbModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "nameTag") val nameTag: String
) {
    companion object {
        val DEFAULT_TAGS = listOf(
            TagDbModel(4, "Other"),
            TagDbModel(1, "Home"),
            TagDbModel(3, "Work"),
            TagDbModel(2, "Mobile"),
        )
        val DEFAULT_TAG = DEFAULT_TAGS[0]
    }
}