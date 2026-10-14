package com.gabo8086.misgastos.data.backup

/**
 * Forma del respaldo JSON. El campo [version] es independiente de la
 * versión del esquema de Room y solo cambia si cambia este formato.
 */
data class BackupFile(
    val app: String = "expense-buddy",
    val version: Int,
    val exportedAt: String,
    val expenses: List<BackupExpense>
)

data class BackupExpense(
    val id: String,
    val amount: Long,
    val category: String,
    val description: String,
    val dateMillis: Long
)

const val CURRENT_BACKUP_VERSION = 1
const val BACKUP_APP_ID = "expense-buddy"
