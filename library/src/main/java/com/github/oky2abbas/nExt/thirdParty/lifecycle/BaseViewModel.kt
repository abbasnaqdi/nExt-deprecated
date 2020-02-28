package com.github.oky2abbas.nExt.thirdParty.lifecycle

import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

abstract class BaseViewModel : ViewModel() {
    private val composite by lazy { CompositeDisposable() }

    fun Disposable.addToComposite() {
        composite.add(this)
    }

    override fun onCleared() {
        composite.clear()
        super.onCleared()
    }
}