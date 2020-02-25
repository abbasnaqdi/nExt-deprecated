package com.github.oky2abbas.nExt.thirdParty.bus

import org.greenrobot.eventbus.EventBus

fun Any.postBus() {
    EventBus.getDefault().post(this)
}

fun Any.postToBusToStick() {
    EventBus.getDefault().postSticky(this)
}

fun Any.removeStickyFromBus() {
    EventBus.getDefault().removeStickyEvent(this)
}

fun Any.registerBus() {
    EventBus.getDefault().register(this)
}

fun Any.unRegisterBus() {
    EventBus.getDefault().unregister(this)
}

fun Any.isRegisterBus(): Boolean {
    return EventBus.getDefault().isRegistered(this)
}