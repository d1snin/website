/*
 * Copyright 2023-2024 Mikhail Titov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.d1s.website.translation

import dev.d1s.beam.client.app.state.SpaceContext
import dev.d1s.beam.client.app.state.translation
import dev.d1s.beam.commons.GlobalTranslation
import dev.d1s.beam.commons.VERSION

suspend fun SpaceContext.russianTranslation() {
    translation {
        languageCode = "ru"
        default = false

        translations(
            GlobalTranslation.LOCATION_ICON_ALT to "Иконка пространства Beam",
            GlobalTranslation.LOCATION_DEFAULT_TITLE to "Beam",
            GlobalTranslation.LOCATION_DEFAULT_REMARK to "Работает на движке [Beam][https://github.com/d1snin/beam] v$VERSION",
            GlobalTranslation.LOCATION_EXPLORE_DROPDOWN_CALLOUT to "Обзор",
            GlobalTranslation.LOCATION_DAEMON_STATUS_CONNECTED to "Подключен к сервису.",
            GlobalTranslation.LOCATION_DAEMON_STATUS_DISCONNECTED to "Не удалось подключиться к сервису.",
            GlobalTranslation.LOCATION_DAEMON_STATUS_MS_UNIT to "мс",
            GlobalTranslation.LOCATION_FAILURE_CARD_NOT_FOUND_ICON_ALT to "Иконка 404",
            GlobalTranslation.LOCATION_FAILURE_CARD_NOT_FOUND_MESSAGE to "Мы ничего не нашли.",
            GlobalTranslation.LOCATION_FAILURE_CARD_EMPTY_SPACE_ICON_ALT to "Иконка пустого пространства",
            GlobalTranslation.LOCATION_FAILURE_CARD_EMPTY_SPACE_MESSAGE to "Эта страница выглядит пустой.",
            GlobalTranslation.LOCATION_FAILURE_CARD_LOST_CONNECTION_ICON_ALT to "Иконка потерянного соединения.",
            GlobalTranslation.LOCATION_FAILURE_CARD_LOST_CONNECTION_MESSAGE to "Соединение с сервисом потеряно.",
            GlobalTranslation.LOCATION_FOOTER_LANGUAGE_SWITCHER_MESSAGE to "Поменять язык...",
            GlobalTranslation.LOCATION_SPACE_LISTING_MESSAGE to "Посетите другие страницы:",
            GlobalTranslation.LOCATION_SPACE_LISTING_FETCH_MORE_BUTTON to "Загрузить больше",
            GlobalTranslation.LOCATION_BLOCK_COLLAPSED_CONTENT_ENTITY_BUTTON_MESSAGE to "Подробнее",

            WebsiteTranslation.LOCATION_ROOT_TITLE to "d1snin's page",
            WebsiteTranslation.LOCATION_ROOT_DESCRIPTION to "Моя публичная страница. Здесь можно узнать чуть больше обо мне.",
            WebsiteTranslation.LOCATION_ROOT_INTRO_HEADING to "(:emoji-wink:)(orange) Говорю компьютерам, что им делать.",
            WebsiteTranslation.LOCATION_ROOT_INTRO_PARAGRAPH to "Привет! Меня зовут Михаил. Я - веб-разработчик-энтузиаст. " +
                    "Люблю Kotlin и все, что его касается. Больше всего заинтересован в бэкенд-разработке. " +
                    "Я имею широкий опыт работы с крупными JVM фрэймворками, включая Spring (Boot, Data, Web, etc), JPA и другие " +
                    "Сейчас работаю на Kotlin вместе с Ktor и другими специализированными библиотеками. Пишу фронтенд тоже на Kotlin. Использую [KVision][https://kvision.io].",
            WebsiteTranslation.LOCATION_ROOT_WHAT_IS_THIS_HEADING to "(:question-circle:)(orange) Что это такое?",
            WebsiteTranslation.LOCATION_ROOT_WHAT_IS_THIS_FIRST_PARAGRAPH to "Это мой веб-сайт, запущенный на моем *веб-движке* - [*Beam*][https://github.com/d1snin/beam].",
            WebsiteTranslation.LOCATION_ROOT_WHAT_IS_THIS_SECOND_PARAGRAPH to "Здесь можно узнать обо мне, или просто связаться.",
            WebsiteTranslation.LOCATION_ROOT_WHAT_AM_I_DOING_HEADING to "(:hammer:)(orange) Чем я сейчас занимаюсь?",
            WebsiteTranslation.LOCATION_ROOT_WHAT_AM_I_DOING_FIRST_PARAGRAPH to "Сейчас работаю как фриланс-разработчик. Я беру заказы на создание " +
                    "веб-сайтов, чат-ботов, серверных приложений и т.п.",
            WebsiteTranslation.LOCATION_ROOT_WHAT_AM_I_DOING_SECOND_PARAGRAPH to "Преимущественно, работаю с локальным российским рынком. Подробнее можно узнать на сайте.",
            WebsiteTranslation.LOCATION_ROOT_WHAT_AM_I_DOING_BUSINESS_WEBSITE_TEXT to "Перейти к titov.digital",
            WebsiteTranslation.LOCATION_ROOT_WHAT_AM_I_DOING_BUSINESS_WEBSITE_URL to "https://titov.digital",
            WebsiteTranslation.LOCATION_ROOT_OPEN_SOURCE_HEADING to "(:github:)(orange) Проекты с открытым кодом",
            WebsiteTranslation.LOCATION_ROOT_OPEN_SOURCE_PARAGRAPH to "Я работаю над кучкой проектов с открытым исходным кодом. Вы можете покапаться в репозиториях на моем GitHub.",
            WebsiteTranslation.LOCATION_ROOT_OPEN_SOURCE_GITHUB_TEXT to "Перейти в GitHub",
            WebsiteTranslation.LOCATION_ROOT_OPEN_SOURCE_GITHUB_URL to "https://github.com/d1snin",
            WebsiteTranslation.LOCATION_ROOT_CONTACTS_HEADING to "(:chat-dots:)(orange) Как мне написать?",
            WebsiteTranslation.LOCATION_ROOT_CONTACTS_PARAGRAPH to "Со мной можно пообщаться в Telegram. Вот ссылка. *Не стесняйтесь даже просто написать!*",
            WebsiteTranslation.LOCATION_ROOT_CONTACTS_TELEGRAM_TEXT to "Перейти в Telegram",
            WebsiteTranslation.LOCATION_ROOT_CONTACTS_TELEGRAM_URL to "https://t.me/d1snin",

            WebsiteTranslation.LOCATION_SECURITY_ROOM_TITLE to "Security Room",
            WebsiteTranslation.LOCATION_SECURITY_ROOM_DESCRIPTION to "Листинг локальных IP-камер.",

            WebsiteTranslation.LOCATION_IMAGEBOARD_TITLE to "Имиджборд",
            WebsiteTranslation.LOCATION_IMAGEBOARD_DESCRIPTION to "Рандомные картинки из галереи программиста",
            WebsiteTranslation.LOCATION_IMAGEBOARD_INTRO_HEADING to "(:images:)(orange) Велком на имиджборд.",
            WebsiteTranslation.LOCATION_IMAGEBOARD_INTRO_PARAGRAPH to "Сюда я закидываю абсолютно рандомные картинки, которые я нашел где-то в *самых дальних участках паутины*.",

            WebsiteTranslation.LOCATION_GALLERY_TITLE to "Галерея",
            WebsiteTranslation.LOCATION_GALLERY_DESCRIPTION to "Повседневная жизнь. На картинках.",
            WebsiteTranslation.LOCATION_GALLERY_INTRO_HEADING to "(:images:)(orange) Имиджборд на реальных событиях.",
            WebsiteTranslation.LOCATION_GALLERY_INTRO_PARAGRAPH to "Сюда кидаю картинки, которые были сделаны лично мной, а не как в [имиджборде][/imageboard]. Посты здесь редкие. *Приятного просмотра*."
        )
    }
}