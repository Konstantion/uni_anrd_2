package com.konstantion.lab2.ui.main

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.konstantion.lab2.MainActivity
import com.konstantion.lab2.databinding.FragmentThirdTabBinding

class ThirdTabFragment : Fragment() {

    private var _binding: FragmentThirdTabBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentThirdTabBinding.inflate(inflater, container, false)

        binding.buttonToFirstActivity.setOnClickListener {
            val intent = Intent(activity, MainActivity::class.java)
            startActivity(intent)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
