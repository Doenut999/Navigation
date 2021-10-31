package io.peng.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import io.peng.navigation.databinding.FragmentBeInBinding

class BeIn : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val questions = 11
        val correct = 12
        val binding: FragmentBeInBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_be_in, container, false)
        binding.beInBtn.setOnClickListener {
            Navigation.findNavController(it).navigate(BeInDirections.actionBeInToStepOut(questions, correct))
        }
        return binding.root
    }
}