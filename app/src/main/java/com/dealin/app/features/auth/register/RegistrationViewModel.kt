package com.dealin.app.features.auth.register

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import org.orbitmvi.orbit.ContainerHost
import org.orbitmvi.orbit.viewmodel.container
import javax.inject.Inject

@HiltViewModel
class RegistrationViewModel @Inject constructor(): ContainerHost<RegistrationState, RegistrationSideEffect>, ViewModel() {
    override val container = container<RegistrationState, RegistrationSideEffect>(RegistrationState())

}