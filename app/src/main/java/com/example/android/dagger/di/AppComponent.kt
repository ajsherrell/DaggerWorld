package com.example.android.dagger.di

import com.example.android.dagger.registration.RegistrationActivity
import dagger.Component

@Component
interface AppComponent {
    //classes that can be injected by this component
    fun inject(activity: RegistrationActivity)
}