package com.nimadugarov.gamepowergiveaways.mvp.models.gateways

import com.nimadugarov.gamepowergiveaways.data.entities.GiveawayDetails
import com.nimadugarov.gamepowergiveaways.data.network.ApiService
import com.nimadugarov.gamepowergiveaways.data.network.entities.GiveawayResponse
import retrofit2.Call

/**
 * Класс с методами зазрузки раздач и детальной информации о них
 */
class GiveawayGateway(private val apiService: ApiService) {

    fun getGiveawaysCall(
        platform: String,
        type: String,
        sortBy: String
    ): Call<GiveawayResponse> = apiService.getGiveaways(
        platform = platform,
        type = type,
        sortBy = sortBy
    )

    fun getGiveawayDetailsCall(giveawayId: Long): Call<GiveawayDetails> =
        apiService.getGiveawayDetails(giveawayId)
}