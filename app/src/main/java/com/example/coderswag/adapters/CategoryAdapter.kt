package com.example.coderswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.coderswag.R
import com.example.coderswag.model.Category

class CategoryAdapter(context: Context, category: List<Category>) : BaseAdapter() {

    val context = context
    val categories = category


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        val holder: ViewHolder

        if (convertView == null) {

            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()
            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)

            holder.categoryName = categoryView.findViewById(R.id.categoryName)

            categoryView.tag = holder
            println("I exist for the first time!")
        } else {
            holder = convertView.tag as ViewHolder
            categoryView = convertView
            println("Go green, recycle!")
        }


        val category = categories[position]

        val resourceId =
            context.resources.getIdentifier(category.image, "drawable", context.packageName)

        holder.categoryImage?.setImageResource(resourceId)
        holder.categoryName?.text = category.title
        println(resourceId)

        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

    private class ViewHolder {
        var categoryImage: ImageView? = null
        var categoryName: TextView? = null
    }
}