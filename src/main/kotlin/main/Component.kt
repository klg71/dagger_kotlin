package main

import dagger.Component
import javax.inject.Singleton

@Component
@Singleton
interface Component {
    fun inject(companion: Application)
}