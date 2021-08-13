package ru.kuchanov.viewpager2fragmentexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.kuchanov.viewpager2fragmentexample.databinding.FirstFragmentBinding

class FirstFragment : Fragment() {

    lateinit var binding: FirstFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FirstFragmentBinding.inflate(inflater)
        return binding.root
    }
}