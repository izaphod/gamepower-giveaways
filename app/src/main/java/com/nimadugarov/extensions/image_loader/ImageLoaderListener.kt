package com.nimadugarov.extensions.image_loader

/**
 * Слушатель состояния загрузки изображения
 */
interface ImageLoaderListener {
    /**
     * Произошла ошибка при загрузке изображения
     *
     * @param error текст ошибки
     */
    fun onError(error: String)

    /**
     * Изображение успешно загружено
     */
    fun onSuccess()
}