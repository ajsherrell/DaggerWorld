package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.registration.RegistrationActivity
import dagger.BindsInstance
import dagger.Component

//definition of a Dagger component that adds info from the StorageModule to the graph.
@Component(modules = [StorageModule::class])
interface AppComponent {

    //factory to create instances of the AppComponent
    @Component.Factory
    interface Factory {
        //with @BindsInstance, the context passed in will be available in the graph
        fun create(@BindsInstance context: Context): AppComponent
    }

    //classes that can be injected by this component
    fun inject(activity: RegistrationActivity)
}