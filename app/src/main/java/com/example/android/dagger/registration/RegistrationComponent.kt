package com.example.android.dagger.registration

import com.example.android.dagger.di.ActivityScope
import com.example.android.dagger.registration.enterdetails.EnterDetailsFragment
import com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragment
import dagger.Subcomponent

//definition of a Dagger Subcomponent
@ActivityScope
@Subcomponent
interface RegistrationComponent {

    //factory to create instances of registration component
    @Subcomponent.Factory
        interface Factory {
            fun create(): RegistrationComponent
        }

    //classes that can be injected by this component
    fun inject(activity: RegistrationActivity)
    fun inject(fragment: EnterDetailsFragment)
    fun inject(fragment: TermsAndConditionsFragment)
}