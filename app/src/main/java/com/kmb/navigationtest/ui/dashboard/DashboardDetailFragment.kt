package com.kmb.navigationtest.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavArgs
import androidx.navigation.fragment.navArgs
import com.kmb.navigationtest.R
import kotlinx.android.synthetic.main.fragment_dashboard_detail.*

class DashboardDetailFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardDetailViewModel

    val value by navArgs<NavArgs>()

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?): View? {
        dashboardViewModel =  ViewModelProvider(this).get(DashboardDetailViewModel::class.java)

        return inflater.inflate(R.layout.fragment_dashboard_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val value by navArgs<NavArgs>()

        dashboardViewModel.text.observe(viewLifecycleOwner, Observer {
            text_dashboard_detail.text = it
        })
    }
}