package com.dev.scout_new_api

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.dev.scout_new_api.databinding.FragmentTermsOfServiceBinding

class TermsOfServiceFragment : Fragment() {

    private var _binding: FragmentTermsOfServiceBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTermsOfServiceBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.ivCloseTerms.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.btnAcceptTerms.setOnClickListener {
            findNavController().popBackStack()
            // In a real scenario, this might save the acceptance state
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}