package com.dealin.app.features.splash

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import org.orbitmvi.orbit.ContainerHost
import org.orbitmvi.orbit.viewmodel.container

@HiltViewModel
class SplashViewModel : ContainerHost<Any, Nothing>, ViewModel() {

    override val container = container<Any, Nothing>(Any())

}