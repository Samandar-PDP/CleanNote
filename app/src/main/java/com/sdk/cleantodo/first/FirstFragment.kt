package com.sdk.cleantodo.first

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.sdk.cleantodo.R
import com.sdk.cleantodo.base.BaseFragment
import com.sdk.cleantodo.databinding.FragmentFirstBinding


class FirstFragment : BaseFragment(R.layout.fragment_first) {
    private var _binding: FragmentFirstBinding? =  null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentFirstBinding.bind(view)

        binding.fab.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}