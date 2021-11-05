package com.nimadugarov.gamepowergiveaways.mvp.views

import com.nimadugarov.gamepowergiveaways.data.entities.Giveaway
import com.nimadugarov.gamepowergiveaways.mvp.views.base.ContentLoadingView
import moxy.viewstate.strategy.alias.AddToEndSingle
import moxy.viewstate.strategy.alias.OneExecution

/**
 * View для экрана со списком раздаваемых игр
 */
interface GameGiveawaysView : ContentLoadingView {

    /**
     * Отобразить список [раздаваемых игр][Giveaway]
     */
    @AddToEndSingle
    fun showGameGiveaways(gameGiveaways: List<Giveaway>)

    /**
     * Перейти к экрану с детальной информацией о раздаваемой игре
     */
    @OneExecution
    fun showGameGiveawayDetails(giveawayId: Long)
}