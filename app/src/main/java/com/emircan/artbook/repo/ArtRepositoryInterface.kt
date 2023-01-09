package com.emircan.artbook.repo

import androidx.lifecycle.LiveData
import com.emircan.artbook.model.ImageResponse
import com.emircan.artbook.roomdb.Art
import com.emircan.artbook.util.Resource

interface ArtRepositoryInterface {

    suspend fun insertArt(art: Art)

    suspend fun deleteArt(art: Art)

    fun getArt() : LiveData<List<Art>>

    suspend fun searchImage(imageString: String) : Resource<ImageResponse>

}