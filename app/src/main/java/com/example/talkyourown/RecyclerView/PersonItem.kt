package com.example.talkyourown.RecyclerView

import android.content.Context
import com.example.talkyourown.Glide.GlideApp
import com.example.talkyourown.R
import com.example.talkyourown.model.User
import com.example.talkyourown.util.StorageUtil
import com.xwray.groupie.kotlinandroidextensions.Item
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import kotlinx.android.synthetic.main.item_person.*
import kotlinx.android.synthetic.main.item_person.view.*

class PersonItem ( val person: User,
                   val userId: String,
                   private val context: Context)
    :Item(){
    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.textView_name.text = person.name
        viewHolder.textView_bio.text = person.bio
        if (person.profilePicturePath != null)
            GlideApp.with(context)
                .load(StorageUtil.pathToReference(person.profilePicturePath))
                .placeholder(R.drawable.ic_account_box_black_24dp)
                .into(viewHolder.imageviews)

    }

    override fun getLayout() = R.layout.item_person


}