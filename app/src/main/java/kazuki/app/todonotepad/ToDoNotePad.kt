package kazuki.app.todonotepad

import android.app.Application
import io.realm.Realm

class ToDoNotePad : Application(){
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }
}
