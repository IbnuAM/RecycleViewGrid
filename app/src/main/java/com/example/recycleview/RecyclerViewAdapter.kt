package com.example.recycleview
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item_view.view.*

class RecyclerViewAdapter(private val context: MainActivity, private val kontakList:
ArrayList<KontakModel>) :
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(
            R.layout.list_item_view, parent, false))
    }
    override fun getItemCount(): Int {
        return kontakList.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(kontakList[position])
    }
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val kontakLogo = view.imgKontakPict
        val kontakName = view.txtKontakName
        fun bindItems(data : KontakModel){
            kontakLogo?.setImageBitmap(data.logo)
            kontakName?.text = data.nama
            itemView.setOnClickListener {
                val text = data.nama
                Toast.makeText(itemView.context, text,
                    Toast.LENGTH_LONG).show()
            }
        }
    }
}
