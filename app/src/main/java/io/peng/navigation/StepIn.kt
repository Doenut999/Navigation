package io.peng.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import io.peng.navigation.databinding.FragmentStepInBinding
import io.peng.navigation.databinding.FragmentWelcomeBinding


class StepIn : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentStepInBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_step_in, container, false)
        binding.stepInBtn.setOnClickListener {
            Navigation.findNavController(it).navigate(StepInDirections.actionStepInToBeIn())
        }
        return binding.root
    }

}