package com.gabo8086.misgastos.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.gabo8086.misgastos.data.local.dao.CategoryDao
import com.gabo8086.misgastos.data.local.dao.ExpenseDao
import com.gabo8086.misgastos.data.local.entity.CategoryEntity
import com.gabo8086.misgastos.data.local.entity.ExpenseEntity

@Database(
    entities = [ExpenseEntity::class, CategoryEntity::class],
    version = 1,
    exportSchema = true
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun expenseDao(): ExpenseDao
    abstract fun categoryDao(): CategoryDao

    companion object {
        const val DATABASE_NAME = "mis-gastos.db"
    }
}
