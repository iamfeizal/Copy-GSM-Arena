package com.example.gsmarenaimam

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListGadgetAdapter(private val listGadget: ArrayList<Gadget>) : RecyclerView.Adapter<ListGadgetAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater
            .from(viewGroup.context)
            .inflate(R.layout.item_row_gadget, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listGadget.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, rate, photo, overview) = listGadget[position]

        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions())
            .into(holder.imgPhoto)

        holder.tvName.text = name
        holder.tvRate.text = rate

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, DetailPage::class.java)
            moveDetail.putExtra(DetailPage.EXTRA_RATE, rate)
            moveDetail.putExtra(DetailPage.EXTRA_NAME, name)
            moveDetail.putExtra(DetailPage.EXTRA_PHOTO, photo)
            moveDetail.putExtra(DetailPage.EXTRA_OVERVIEW, overview)
            mContext.startActivity(moveDetail)
        }
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvRate: TextView = itemView.findViewById(R.id.tv_item_rate)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

}