package com.gabo8086.misgastos.data.local.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "expenses",
    foreignKeys = [
        ForeignKey(
            entity = CategoryEntity::class,
            parentColumns = ["id"],
            childColumns = ["categoryId"],
            onDelete = ForeignKey.RESTRICT
        )
    ],
    indices = [Index("categoryId"), Index("dateMillis")]
)
data class ExpenseEntity(
    @PrimaryKey
    val id: String,
    val amount: Long,
    val categoryId: String,
    val description: String,
    val dateMillis: Long
)
