package id.kotlin.basicmvvm

import android.view.View
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.BR
import com.google.android.material.snackbar.Snackbar

class MainViewModel : BaseObservable(), MainView {

  var name: String = String()
    @Bindable get

  var input: String = String()
    @Bindable
    set(value) {
      field = value
      name = value
      notifyPropertyChanged(BR.name)
    }

  override fun doSomething(view: View) {
    name = "Hai!"
    notifyPropertyChanged(BR.name)
    Snackbar.make(view, "Halo MVVM!", Snackbar.LENGTH_SHORT).show()
  }
}