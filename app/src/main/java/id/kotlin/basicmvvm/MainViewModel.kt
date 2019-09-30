package id.kotlin.basicmvvm

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.BR

class MainViewModel : BaseObservable() {

  var name: String = String()
    @Bindable get

  var input: String = String()
    @Bindable
    set(value) {
      field = value
      name = value
      notifyPropertyChanged(BR.name)
    }
}