package com.dev.scout_new_api.ui

import android.os.Bundle
import android.util.Patterns
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.dev.scout_new_api.R
import com.dev.scout_new_api.databinding.FragmentEnterEmailBinding

class EnterEmailFragment : Fragment() {

    private var _binding: FragmentEnterEmailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentEnterEmailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.ivBackArrow.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.btnNextEmail.setOnClickListener {
            val email = binding.etEmail.text.toString()
            if (email.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                findNavController().navigate(R.id.action_enterEmailFragment_to_verifyEmailFragment)
            } else {
                binding.tilEmail.error = "Please enter a valid email address"
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}