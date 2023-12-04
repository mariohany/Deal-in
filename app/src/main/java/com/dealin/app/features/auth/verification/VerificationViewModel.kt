package com.dealin.app.features.auth.verification

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import org.orbitmvi.orbit.ContainerHost
import org.orbitmvi.orbit.viewmodel.container
import javax.inject.Inject

@HiltViewModel
class VerificationViewModel @Inject constructor() : ContainerHost<VerificationState, VerificationSideEffect>, ViewModel() {

    override val container = container<VerificationState, VerificationSideEffect>(VerificationState())


}