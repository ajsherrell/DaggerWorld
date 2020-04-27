package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.registration.RegistrationActivity
import com.example.android.dagger.registration.enterdetails.EnterDetailsFragment
import com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

//definition of a Dagger component that adds info from the StorageModule to the graph.
@Singleton
@Component(modules = [StorageModule::class])
interface AppComponent {

    //factory to create instances of the AppComponent
    @Component.Factory
    interface Factory {
        //with @BindsInstance, the context passed in will be available in the graph
        fun create(@BindsInstance context: Context): AppComponent
    }

    //classes that can be injected by this component
    fun inject(activity: MainActivity)
    fun inject(activity: RegistrationActivity)
    fun inject(fragment: EnterDetailsFragment)
    fun inject(fragment: TermsAndConditionsFragment)
}