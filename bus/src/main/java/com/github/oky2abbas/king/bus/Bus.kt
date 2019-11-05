import org.greenrobot.eventbus.EventBus

fun Any.callBus() {
   EventBus.getDefault().post(this)
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