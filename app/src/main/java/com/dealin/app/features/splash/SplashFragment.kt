package com.dealin.app.features.splash

import com.dealin.app.core.presentation.view.BaseFragment
import com.dealin.app.databinding.FragmentSplashBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashFragment : BaseFragment<FragmentSplashBinding>(FragmentSplashBinding::inflate) {

    private lateinit var viewModel: SplashViewModel

}