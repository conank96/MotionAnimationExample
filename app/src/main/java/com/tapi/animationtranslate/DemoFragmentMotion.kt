package com.tapi.animationtranslate

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay

class DemoFragmentMotion : Fragment() {

    private lateinit var mView :View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_demo_motion, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btDemo =  view.findViewById<Button>(R.id.bt_demo)

        val motion = view.findViewById<MotionLayout>(R.id.motion_demo)
        btDemo.setOnClickListener {
            lifecycleScope.launchWhenResumed {
                motion.transitionToEnd()
delay(5000)
                motion.transitionToStart()

            }

            Log.d("manh.nq", "onViewCreated:   onlick")
        }
    }


}