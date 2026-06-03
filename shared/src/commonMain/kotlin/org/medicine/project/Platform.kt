package org.medicine.project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform