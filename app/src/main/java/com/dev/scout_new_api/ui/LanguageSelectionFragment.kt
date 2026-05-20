package com.dev.scout_new_api.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.dev.scout_new_api.R
import com.dev.scout_new_api.databinding.FragmentLanguageSelectionBinding

class LanguageSelectionFragment : Fragment() {

    private var _binding: FragmentLanguageSelectionBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLanguageSelectionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnContinueLang.setOnClickListener {
            // Navigate to Welcome/Sign In screen
            findNavController().navigate(R.id.action_languageSelectionFragment_to_welcomeFragment)
        }

        binding.btnSkipLang.setOnClickListener {
            findNavController().navigate(R.id.action_languageSelectionFragment_to_welcomeFragment)
        }
        
        // In a real app, clicking other cards would update the UI to select them
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
