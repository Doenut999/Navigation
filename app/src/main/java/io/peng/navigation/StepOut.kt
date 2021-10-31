package io.peng.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import io.peng.navigation.databinding.FragmentStepOutBinding
import io.peng.navigation.databinding.FragmentWelcomeBinding


class StepOut : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentStepOutBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_step_out, container, false)
        binding.stepOutBtn.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.stepOut)
        }
        return binding.root
    }
}
