package main

val graph: Component = DaggerComponent.builder().build()

fun main(args: Array<String>) {
    Application().apply {
        run()
    }
}

