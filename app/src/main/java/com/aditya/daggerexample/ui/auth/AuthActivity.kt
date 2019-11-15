package com.aditya.daggerexample.ui.auth

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.aditya.daggerexample.R
import com.aditya.daggerexample.viewmodels.ViewModelProviderFactory
import com.bumptech.glide.RequestManager
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class AuthActivity : DaggerAppCompatActivity() {

    private val TAG = "AuthActivity"

    @Inject lateinit var  drawable: Drawable

    @Inject lateinit var  requestManager: RequestManager

    @Inject lateinit var providerFactory: ViewModelProviderFactory

    @Inject lateinit var  authViewModel: AuthViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        authViewModel = ViewModelProvider(this,providerFactory).get(AuthViewModel::class.java)
        Log.d(TAG, "onCreate: ${authViewModel.value}")
        setLogo()
    }

    fun setLogo(){
        requestManager.load(drawable).into(findViewById(R.id.login_logo))
    }
}
