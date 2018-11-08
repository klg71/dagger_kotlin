package main

import javax.inject.Inject

class Application {

    @Inject
    lateinit var factory: Factory

    init {
        graph.inject(this)
    }

    fun run(){
        println(factory.produce())
    }
}