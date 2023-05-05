package com.example.mynotes.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class NoteDbModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "detail") val content: String,
    @ColumnInfo(name = "color_id") val colorId: Long,
    @ColumnInfo(name = "tag_id") val tagId: Long,
    @ColumnInfo(name = "in_trash") val isInTrash: Boolean
) {
    companion object {
        val DEFAULT_NOTES = listOf(
            NoteDbModel(1, "Adam Smith", "0987887583",  3, 2,false),
            NoteDbModel(2, "Bill Crimson", "0629341489",  4, 2,false),
            NoteDbModel(3, "Pancake Ransom", "0921379421",  3, 2,false),
        )
    }
}
