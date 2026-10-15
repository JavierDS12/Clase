package com.example.examen1.data

import com.example.examen1.domain.model.Tarea

object Tareas {

    private val tareas = mutableListOf(
        Tarea("Estudiar Android XML", "Hoy", "10:00"),
        Tarea("Hacer ejercicio", "Hoy", "18:00"),
        Tarea("Leer un libro", "Mañana", "09:00"),
        Tarea("Preparar la presentación", "Mañana", "12:00")
    )

    fun dameTareas() = tareas.toList()

}