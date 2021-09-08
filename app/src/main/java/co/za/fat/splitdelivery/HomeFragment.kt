package co.za.fat.splitdelivery

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class HomeFragment: Fragment(R.layout.fragment_home) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnLogin = getView()?.findViewById<Button>(R.id.btn_login)

        btnLogin?.setOnClickListener {
            //val action = HomeFragmentDirections.actionHomeFragmentToLoginFragment()
            findNavController().navigate(R.id.action_homeFragment_to_loginFragment, null)

        }

    }
}