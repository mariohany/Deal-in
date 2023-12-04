package com.dealin.app.features.auth.login

import androidx.fragment.app.viewModels
import com.dealin.app.core.presentation.view.BaseFragment
import com.dealin.app.databinding.FragmentLoginBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment : BaseFragment<FragmentLoginBinding>(FragmentLoginBinding::inflate) {

    private val viewModel: LoginViewModel by viewModels()


}