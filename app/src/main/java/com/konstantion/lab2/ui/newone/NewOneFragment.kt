package com.konstantion.lab2.ui.newone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.konstantion.lab2.R
import com.konstantion.lab2.databinding.FragmentHomeBinding

/**
 * A simple [Fragment] subclass.
 * Use the [NewOneFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class NewOneFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val newOneModel: NewOneModel = ViewModelProvider.create(this).get(NewOneModel::class)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        newOneModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
//        return inflater.inflate(R.layout.fragment_new_one, container, false)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            NewOneFragment()
    }
}