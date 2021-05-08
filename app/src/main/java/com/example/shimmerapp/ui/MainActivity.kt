package com.example.shimmerapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shimmerapp.adapter.UserListAdapter
import com.example.shimmerapp.data.models.Resource
import com.example.shimmerapp.viewmodels.MainViewModel
import com.example.shimmerapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: ActivityMainBinding
    private var adapter: UserListAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindView()
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        initRecyclerView()
        observeViewModel()
        viewModel.getUserList()
    }

    private fun observeViewModel() {
        viewModel.apply {
            userListObserver.observe(this@MainActivity, Observer { status ->
                when (status) {
                    is Resource.Loading -> {
                        binding.shimmerLayout.startShimmer()
                    }
                    is Resource.Success -> {
                        status.data?.let {
                            adapter?.swapData(it)
                            showRecyclerView()
                        }
                    }
                }
            })
        }
    }

    private fun initRecyclerView() {
        adapter = UserListAdapter(
            this@MainActivity,
            emptyList()
        )
        binding.userListRecyclerview.layoutManager = LinearLayoutManager(
            this@MainActivity,
            LinearLayoutManager.VERTICAL,
            false
        )
        binding.userListRecyclerview.adapter = adapter
        binding.userListRecyclerview.setHasFixedSize(true)
    }

    private fun bindView() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun showRecyclerView() {
        binding.shimmerLayout.apply {
            stopShimmer()
            visibility = View.GONE
        }
        binding.userListRecyclerview.visibility = View.VISIBLE
    }

}