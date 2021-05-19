package com.example.navigationsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SelectProduct : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_select_product, container, false)
        val viewAdapter = MyAdapter(createProductList())

        view.findViewById<RecyclerView>(R.id.product_list).run {
            // use this setting to improve performance if you know that changes
            // in content do not change the layout size of the RecyclerView
            setHasFixedSize(true)

            // specify an viewAdapter (see also next example)
            adapter = viewAdapter
        }

        return view
    }

    private fun createProductList(): ArrayList<ProductItem> {
        val productList = ArrayList<ProductItem>()
        val product1 = ProductItem("Milk", " 2$")
        val product2 = ProductItem("Fish", " 5$")
        val product3 = ProductItem("Meat", " 10$")
        productList.add(product1)
        productList.add(product2)
        productList.add(product3)
        return productList
    }
}