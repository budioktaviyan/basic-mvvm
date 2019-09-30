package id.kotlin.basicmvvm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.google.android.material.snackbar.Snackbar
import id.kotlin.basicmvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    binding.btnClick.setOnClickListener { Snackbar.make(binding.root, "Halo!", Snackbar.LENGTH_SHORT).show() }

    val model = MainModel(name = "Budi Oktaviyan")
    binding.user = model
  }
}