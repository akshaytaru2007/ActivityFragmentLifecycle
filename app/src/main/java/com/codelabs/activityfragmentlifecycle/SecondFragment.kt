package com.codelabs.activityfragmentlifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.codelabs.activityfragmentlifecycle.databinding.FragmentSecondBinding
import kotlin.math.log

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.d(TAG, "${MainActivity.COMMON_TAG}: SecondFragment onCreateView: ")
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "${MainActivity.COMMON_TAG}: SecondFragment onViewCreated: ")
        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(FirstFragment.TAG, "${MainActivity.COMMON_TAG}: SecondFragment onAttach: ")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(FirstFragment.TAG, "${MainActivity.COMMON_TAG}: SecondFragment onDetach: ")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(FirstFragment.TAG, "${MainActivity.COMMON_TAG}: SecondFragment onCreate: ")
    }


    override fun onStart() {
        super.onStart()
        Log.d(FirstFragment.TAG, "${MainActivity.COMMON_TAG}: SecondFragment onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(FirstFragment.TAG, "${MainActivity.COMMON_TAG}: SecondFragment onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(FirstFragment.TAG, "${MainActivity.COMMON_TAG}: SecondFragment onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(FirstFragment.TAG, "${MainActivity.COMMON_TAG}: SecondFragment onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(FirstFragment.TAG, "${MainActivity.COMMON_TAG}: SecondFragment onDestroy: ")
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


    companion object {
        const val TAG = "SecondFragment"
    }
}