package com.sdk.cleantodo.second

import android.os.Bundle
import android.view.View
import com.sdk.cleantodo.R
import com.sdk.cleantodo.base.BaseFragment
import com.sdk.cleantodo.databinding.FragmentSecondBinding

class SecondFragment : BaseFragment(R.layout.fragment_second) {
    private var _binding: FragmentSecondBinding? =  null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentSecondBinding.bind(view)



    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}