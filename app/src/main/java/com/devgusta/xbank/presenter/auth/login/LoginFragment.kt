package com.devgusta.xbank.presenter.auth.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.devgusta.xbank.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        _binding = FragmentLoginBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listenerClicks()
    }

    
    private fun listenerClicks(){
        binding.btnEntrar.setOnClickListener {
            validadeData()
        }
    }

    private fun validadeData(){
        val email = binding.editEmail.text.toString().trim()
        val senha = binding.editSenha.text.toString().trim()

        if(email.isNotEmpty()){
            if(senha.isNotEmpty()){
                Toast.makeText(requireContext(), "TD OK", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(requireContext(),
                    "Digite sua senha", Toast.LENGTH_SHORT).show()
            }
        }else{
            Toast.makeText(requireContext(),
                "Digite seu email", Toast.LENGTH_SHORT).show()
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}