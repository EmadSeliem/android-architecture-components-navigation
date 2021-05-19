package com.example.navigationsample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val myDataset: ArrayList<ProductItem>) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(val item: View) : RecyclerView.ViewHolder(item)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        // create a new view
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_view_item, parent, false)


        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.item.findViewById<TextView>(R.id.product_name).text = myDataset[position].productName
        holder.item.findViewById<TextView>(R.id.product_price).text =
            myDataset[position].productPrice

        /**
         *  Use Safe Args to pass data with type safety
         */
        holder.item.setOnClickListener {
            val bundle = bundleOf("productName" to myDataset[position].productName)

            /**
             * This is to handle Conditional navigation.
             * In case of selecting first item then navigate to success screen.
             * In case of selecting second item then navigate to failure screen.
             */
            if (position == 0) {
                Navigation.findNavController(holder.item).navigate(
                    R.id.action_selectProduct_to_successScreen,
                    bundle
                )
            } else {
                Navigation.findNavController(holder.item).navigate(
                    R.id.action_selectProduct_to_failureScreen,bundle
                )
            }
        }
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = myDataset.size
}
