package jalisoft.com.dummynotaventa

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick


class MainActivity : AppCompatActivity() {


    val items : ArrayList<String> = ArrayList()
    lateinit  var adapter : ArrayAdapter<String>

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bebidas = findViewById<ListView>(R.id.bebidasList)
        val postres = findViewById<ListView>(R.id.postresList)
        val dulces = findViewById<ListView>(R.id.dulcesList)
        val notaVenta = findViewById<ListView>(R.id.notaVentaList)
        adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items)
        notaVenta.adapter = adapter

        bebidas.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,resources.getStringArray(R.array.bebidas))
        postres.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,resources.getStringArray(R.array.postres))
        dulces.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,resources.getStringArray(R.array.dulces))
        putTvClicks(findViewById<ViewGroup>(R.id.parent) as ViewGroup)

        bebidas.setOnItemClickListener(AdapterView.OnItemClickListener { adapterView, view, i, l ->  })
    }

    private fun putTvClicks(group : ViewGroup) {
        var childs = group.childCount
        Log.i("MOTA","CHILDS?>"+childs)
        while (childs >= 0)
        {
            childs--
            if (group.getChildAt(childs) is TextView)
            {
                group.getChildAt(childs).setOnClickListener({
                    val tv = it as TextView
                    insertItem(tv.text.toString())
                })
            }
            else
            {
                try {
                    putTvClicks(group.getChildAt(childs) as ViewGroup)
                }catch (ex : Exception){}
            }

        }

    }

    private fun insertItem(item : String)
    {
        Log.i("MOTA","ITEM INSERTADO")
        items.add(item)
        adapter.notifyDataSetChanged()
    }

}




