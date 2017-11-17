package jalisoft.com.dummynotaventa
import android.view.*
import android.widget.*
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick


class MainActivityUI : AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>) = with(ui){

        verticalLayout {
            val name = editText()
            button("Say Hello") {
                onClick { ctx.toast("Hello, ${name.text}!") }
            }
        }
    }

    private object Ids {

        val bebidasList = 1
        val dulcesList = 2
        val notaVentaList = 3
        val postresList = 4
        val parent = 0
    }

}