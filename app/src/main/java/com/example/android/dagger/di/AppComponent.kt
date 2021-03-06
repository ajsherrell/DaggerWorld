package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.login.LoginComponent
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.registration.RegistrationComponent
import com.example.android.dagger.settings.SettingsActivity
import com.example.android.dagger.user.UserManager
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

//definition of a Dagger component that adds info from the StorageModule to the graph.
@Singleton
@Component(modules = [StorageModule::class, AppSubcomponents::class])
interface AppComponent {

    //factory to create instances of the AppComponent
    @Component.Factory
    interface Factory {
        //with @BindsInstance, the context passed in will be available in the graph
        fun create(@BindsInstance context: Context): AppComponent
    }

    //expose RegistrationComponent factory from the graph
    fun registrationComponent(): RegistrationComponent.Factory
    fun loginComponent(): LoginComponent.Factory

    fun userManager(): UserManager

}