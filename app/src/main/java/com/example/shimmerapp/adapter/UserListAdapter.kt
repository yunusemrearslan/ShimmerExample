package com.example.shimmerapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.shimmerapp.data.models.User
import com.example.shimmerapp.databinding.RowUserListBinding

class UserListAdapter(
    private val context: Context,
    private var userList: List<User>
) : RecyclerView.Adapter<UserListAdapter.TransactionViewHolder>() {

    inner class TransactionViewHolder(
        val binding: RowUserListBinding
    ) : RecyclerView.ViewHolder(binding.root)

    fun swapData(newList: List<User>) {
        this.userList = newList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
        val binding = RowUserListBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return TransactionViewHolder(binding)
    }

    override fun getItemCount(): Int = userList.size

    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {
        with(holder) {
            with(userList[position]) {
                Glide.with(context).load(iconUrl).into(binding.userIcon)
                binding.userName.text = name
                binding.userStatus.text = status
            }
        }
    }
}