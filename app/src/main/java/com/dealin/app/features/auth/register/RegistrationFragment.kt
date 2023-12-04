package com.dealin.app.features.auth.register

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.dealin.app.core.presentation.view.BaseFragment
import com.dealin.app.databinding.FragmentRegistrationBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegistrationFragment : BaseFragment<FragmentRegistrationBinding>(FragmentRegistrationBinding::inflate) {

    private val viewModel: RegistrationViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}