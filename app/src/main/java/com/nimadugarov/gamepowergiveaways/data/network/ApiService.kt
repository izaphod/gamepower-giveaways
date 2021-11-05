package com.nimadugarov.gamepowergiveaways.data.network

import com.nimadugarov.gamepowergiveaways.data.entities.Giveaway
import com.nimadugarov.gamepowergiveaways.data.network.entities.GiveawayResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Интерфейс с запросами Retrofit к GamerPower API
 */
interface ApiService {

    /**
     * Загрузить список [раздач][Giveaway]. Параметры запроса:
     *
     * [platform] платформа (pc, xbox-series-xs, ps5, android и другие)
     *
     * [type]     тип раздачи (игры, бета версии игр, внутриигровые предметы)
     *
     * [sortBy]   тип сортировки (по дате, названию или популярности)
     */
    @GET("giveaways")
    fun getGiveaways(
        @Query("platform") platform: String,
        @Query("type") type: String,
        @Query("sort-by") sortBy: String
    ): Call<GiveawayResponse>

    /**
     * Загрузить детальную информацию о [раздаче][Giveaway], где
     *
     * [giveawayId] - id раздачи
     */
    @GET("giveaway")
    fun getGiveaway(
        @Query("id") giveawayId: Long
    ): Call<Giveaway>
}