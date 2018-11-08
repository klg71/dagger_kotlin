package main

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Factory @Inject constructor() {

    fun produce() = "Auto"
}