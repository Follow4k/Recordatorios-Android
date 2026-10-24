package com.anderson.recordatorios

import androidx.compose.ui.graphics.Color

val work = Category(1, "Trabajo")
val personal = Category(2, "Personal")
val health = Category(3, "Salud")
val study = Category(4, "Estudio")

// Set: no admite categorías repetidas
val categories: Set<Category> = setOf(work, personal, health, study)

// Map: asocia cada categoría con un color
val categoryColors: Map<Category, Color> = mapOf(
    work to Color(0xFF1E88E5),
    personal to Color(0xFF8E24AA),
    health to Color(0xFF43A047),
    study to Color(0xFFF4511E)
)

// List: datos simulados
val reminders: List<Reminder> = listOf(
    Reminder(1, "Entregar informe", work, Priority.High, ReminderStatus.Pending, "Informe mensual", "25/10/2026"),
    Reminder(2, "Comprar regalo", personal, Priority.Low, ReminderStatus.Pending),
    Reminder(3, "Turno con el médico", health, Priority.Medium, ReminderStatus.Completed("20/10/2026")),
    Reminder(4, "Estudiar Kotlin", study, Priority.High, ReminderStatus.Overdue(2), dueDate = "21/10/2026"),
    Reminder(5, "Pagar el alquiler", personal, Priority.High, ReminderStatus.Pending, dueDate = "30/10/2026")
)

// Filtros por estado y prioridad
fun pendingReminders() = reminders.filter { it.status is ReminderStatus.Pending }
fun remindersByPriority(priority: Priority) = reminders.filter { it.priority == priority }