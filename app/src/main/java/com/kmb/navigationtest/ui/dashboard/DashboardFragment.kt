package com.kmb.navigationtest.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.kmb.navigationtest.R
import kotlinx.android.synthetic.main.fragment_dashboard.*

class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?): View? {
        dashboardViewModel =  ViewModelProvider(this).get(DashboardViewModel::class.java)
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dashboardViewModel.text.observe(viewLifecycleOwner, Observer {
            text_dashboard.text = it
        })

        text_dashboard.setOnClickListener {
            navigateToDetail()
        }
    }

    private fun navigateToDetail() {
        val action = DashboardFragmentDirections.actionNavigationDashboardToDashboardDetailFragment(5555)
        findNavController().navigate(action)
    }
}