package com.codelabs.activityfragmentlifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.codelabs.activityfragmentlifecycle.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.d(TAG, "${MainActivity.COMMON_TAG}: FirstFragment onCreateView: ")
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "${MainActivity.COMMON_TAG}: FirstFragment onViewCreated: ")
        binding.buttonFirst.setOnClickListener {
//            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)

        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "${MainActivity.COMMON_TAG}: FirstFragment onAttach: ")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "${MainActivity.COMMON_TAG}: FirstFragment onDetach: ")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "${MainActivity.COMMON_TAG}: FirstFragment onCreate: ")
    }


    override fun onStart() {
        super.onStart()
        Log.d(TAG, "${MainActivity.COMMON_TAG}: FirstFragment onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "${MainActivity.COMMON_TAG}: FirstFragment onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "${MainActivity.COMMON_TAG}: FirstFragment onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "${MainActivity.COMMON_TAG}: FirstFragment onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "${MainActivity.COMMON_TAG}: FirstFragment onDestroy: ")
    }

    override fun onDestroyView() {
        Log.d(TAG, "${MainActivity.COMMON_TAG}: FirstFragment onDestroyView: ")
        super.onDestroyView()
        _binding = null
    }

    companion object {
        const val TAG = "FirstFragment"
    }
}