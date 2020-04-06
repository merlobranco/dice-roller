package com.example.diceroller

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.diceroller.databinding.DiceFragmentBinding
import java.util.*

class DiceFragment : Fragment() {

    private lateinit var binding: DiceFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.dice_fragment, container, false)

        // Getting the Roll Button
        binding.rollButton.setOnClickListener {
            rollDice()
        }

        return binding.root
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1

        // Getting the image resource
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // Populating the image resource
        binding.diceImage.setImageResource(drawableResource)
    }
}