package com.emircan.artbook.view

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.bumptech.glide.RequestManager
import com.emircan.artbook.adapter.ArtRecyclerAdapter
import com.emircan.artbook.adapter.ImageRecyclerAdapter
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Inject

class ArtFragmentFactory @Inject constructor(
    private val artRecyclerAdapter: ArtRecyclerAdapter,
    private val glide : RequestManager,
    private val imageRecyclerAdapter: ImageRecyclerAdapter

) : FragmentFactory(){

    @OptIn(ExperimentalCoroutinesApi::class)
    
    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {

        return when(className){
            ArtsFragment::class.java.name -> ArtsFragment(artRecyclerAdapter)
            ArtDetailsFragment::class.java.name -> ArtDetailsFragment(glide)
            ImageApiFragment::class.java.name -> ImageApiFragment(imageRecyclerAdapter)
            else -> super.instantiate(classLoader, className)
        }

    }
}