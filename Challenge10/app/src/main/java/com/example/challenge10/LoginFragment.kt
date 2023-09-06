package com.example.challenge10

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.challenge10.databinding.FragmentLoginBinding
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!
    private lateinit var auth: FirebaseAuth
    private lateinit var email: String
    private lateinit var password: String


    companion object {
        private const val RC_SIGN_IN = 9001
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        auth = Firebase.auth
        val uptadeUser = auth.currentUser


        if (uptadeUser != null) {
            val action =
                LoginFragmentDirections.actionLoginFragmentToActionFragment(uptadeUser.email.toString())
            findNavController().navigate(action)
        }
        _binding = FragmentLoginBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.buttonSignUp.setOnClickListener {
            email = binding.editTextEmail.text.toString().trim()
            password = binding.editTextPassword.text.toString().trim()

            if (email.isEmpty() && password.isEmpty()) {
                Toast.makeText(requireContext(), "Empty Value", Toast.LENGTH_SHORT).show()
            } else {
                auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        val action =
                            LoginFragmentDirections.actionLoginFragmentToActionFragment(email)
                        Navigation.findNavController(it).navigate(action)
                    }
                }.addOnFailureListener {
                    Toast.makeText(requireContext(), it.localizedMessage, Toast.LENGTH_SHORT).show()
                }
            }

        }

        binding.btnSignIn.setOnClickListener {
            email = binding.editTextEmail.text.toString().trim()
            password = binding.editTextPassword.text.toString().trim()

            if (email.isEmpty() && password.isEmpty()) {
                Toast.makeText(requireContext(), "Empty Value", Toast.LENGTH_SHORT).show()
            } else {
                auth.signInWithEmailAndPassword(email, password).addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        val updateUser = auth.currentUser?.email.toString()
                        val action =
                            LoginFragmentDirections.actionLoginFragmentToActionFragment(updateUser)
                        Navigation.findNavController(it).navigate(action)
                    }
                }.addOnFailureListener {
                    Toast.makeText(requireContext(), it.localizedMessage, Toast.LENGTH_SHORT).show()
                }
            }

        }

        binding.imageViewGoogle.setOnClickListener {
            signIn()

        }

    }

    private fun signIn() {
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(getString(R.string.default_web_client_id))
            .requestEmail()
            .build()

        val googleSignInClient = GoogleSignIn.getClient(requireContext(), gso)
        val signInIntent = googleSignInClient.signInIntent
        startActivityForResult(signInIntent, RC_SIGN_IN)
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == RC_SIGN_IN) {
            // Etkinlikten dönen veriyi al
            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
            try {
                // Google hesabını al
                val account = task.getResult(ApiException::class.java)!!
                // Firebase ile giriş yap
                firebaseAuthWithGoogle(account.idToken!!)
            } catch (e: ApiException) {
                // Hata durumunu göster
                Toast.makeText(
                    requireContext(),
                    "Google sign in failed: ${e.message}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    private fun firebaseAuthWithGoogle(idToken: String) {
        // Google kimlik bilgisini oluştur
        val credential = GoogleAuthProvider.getCredential(idToken, null)
        // Firebase ile giriş yap
        auth.signInWithCredential(credential)
            .addOnCompleteListener(requireActivity()) { task ->
                if (task.isSuccessful) {
                    // Giriş başarılı olduğunda, kullanıcıyı al ve diğer fragmente aktar
                    val user = auth.currentUser
                    val action =
                        LoginFragmentDirections.actionLoginFragmentToActionFragment(user?.email.toString())
                    findNavController().navigate(action)
                } else {
                    // Giriş başarısız olduğunda, hata durumunu göster
                    Toast.makeText(
                        requireContext(),
                        "Firebase sign in failed: ${task.exception?.message}",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
    }


}


