package com.kmb.navigationtest.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.kmb.navigationtest.R
import kotlinx.android.synthetic.main.fragment_nested_graph.*

class NestedGraphFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?): View? {
         return inflater.inflate(R.layout.fragment_nested_graph, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        text_nested_graph.text = "Root of nested graph"

        text_nested_graph.setOnClickListener { openNext() }
    }

    private fun openNext() {
        val action = NestedGraphFragmentDirections.actionNestedGraphFragmentToNestedGraphFragment2()
        findNavController().navigate(action)
    }
}