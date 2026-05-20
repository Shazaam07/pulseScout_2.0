package com.dev.scout_new_api.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.dev.scout_new_api.R
import com.dev.scout_new_api.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {

    private var _binding: FragmentWelcomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentWelcomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSignInEmail.setOnClickListener {
            // Navigate to Enter Email Screen
            findNavController().navigate(R.id.action_welcomeFragment_to_enterEmailFragment)
        }

        binding.btnSignInGmail.setOnClickListener {
            // Placeholder for Google Sign-in flow
        }

        binding.tvCreateAccount.setOnClickListener {
            // Navigate to Create Account / Register Flow (placeholder for now)
        }

        binding.btnLangPill.setOnClickListener {
            // Optionally pop back to Language Selection
            findNavController().popBackStack()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
