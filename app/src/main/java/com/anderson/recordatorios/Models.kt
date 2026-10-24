package com.anderson.recordatorios

data class Category(val id: Int, val name: String)

sealed class Priority(val label: String) {
    data object Low : Priority("Baja")
    data object Medium : Priority("Media")
    data object High : Priority("Alta")
}

sealed class ReminderStatus {
    data object Pending : ReminderStatus()
    data class Completed(val completedAt: String) : ReminderStatus()
    data class Overdue(val daysLate: Int) : ReminderStatus()
}

data class Reminder(
    val id: Int,
    val title: String,
    val category: Category,
    val priority: Priority,
    val status: ReminderStatus,
    val description: String? = null,
    val dueDate: String? = null
)