package com.example.dialogfragmant

import android.os.Bundle
import androidx.fragment.app.DialogFragment
import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater


class DialogFragment: DialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
     ): View?{
        var root: View = inflater.inflate(R.layout.fragment_dialog, container, false)

        return root
    }
}