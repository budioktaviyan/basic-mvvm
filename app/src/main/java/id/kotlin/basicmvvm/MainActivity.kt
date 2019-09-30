package id.kotlin.basicmvvm

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableInt
import com.google.android.material.snackbar.Snackbar
import id.kotlin.basicmvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

  private val model = MainModel(name = "Budi Oktaviyan", count = ObservableInt(0))

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    binding.btnClick.setOnClickListener { Snackbar.make(binding.root, "Halo!", Snackbar.LENGTH_SHORT).show() }
    binding.user = model
  }

  fun onCount(view: View) {
    Log.d(MainActivity::class.java.simpleName, "${view.id}")
    model.count.set(model.count.get().plus(1))
  }
}