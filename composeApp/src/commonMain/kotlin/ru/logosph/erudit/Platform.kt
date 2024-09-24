package ru.logosph.erudit

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform