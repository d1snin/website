package dev.d1s.website.translation

import dev.d1s.beam.client.app.ApplicationContext
import dev.d1s.beam.client.app.state.translation
import dev.d1s.beam.commons.GlobalTranslation

suspend fun ApplicationContext.russianTranslation() {
    translation {
        languageCode = "ru"
        default = false

        translations(
            GlobalTranslation.LOCATION_ICON_ALT to "Иконка пространства Beam",
            GlobalTranslation.LOCATION_SPACE_INFO_DEFAULT_TITLE to "Beam",
            GlobalTranslation.LOCATION_EXPLORE_DROPDOWN_CALLOUT to "Обзор",
            GlobalTranslation.LOCATION_DAEMON_STATUS_CONNECTED to "Подключен к сервису.",
            GlobalTranslation.LOCATION_DAEMON_STATUS_DISCONNECTED to "Не удалось подключиться к сервису.",
            GlobalTranslation.LOCATION_DAEMON_STATUS_MS_UNIT to "мс",
            GlobalTranslation.LOCATION_SPACE_FAILURE_CARD_NOT_FOUND_ICON_ALT to "Иконка 404",
            GlobalTranslation.LOCATION_SPACE_FAILURE_CARD_NOT_FOUND_MESSAGE to "Мы ничего не нашли.",
            GlobalTranslation.LOCATION_SPACE_FAILURE_CARD_EMPTY_SPACE_ICON_ALT to "Иконка пустого пространства",
            GlobalTranslation.LOCATION_SPACE_FAILURE_CARD_EMPTY_SPACE_MESSAGE to "Эта страница выглядит пустой.",
            GlobalTranslation.LOCATION_FOOTER_MESSAGE_FIRST_PART to "Работает на движке",
            GlobalTranslation.LOCATION_FOOTER_MESSAGE_SECOND_PART to "Beam",
            GlobalTranslation.LOCATION_FOOTER_SOURCE_CODE_LINK_MESSAGE to "Исходный код на GitHub",
            GlobalTranslation.LOCATION_FOOTER_SOURCE_CODE_LINK_URL to "https://github.com/d1snin/beam",
            GlobalTranslation.LOCATION_FOOTER_LANGUAGE_SWITCHER_MESSAGE to "Поменять язык...",
            GlobalTranslation.LOCATION_SPACE_LISTING_MESSAGE to "Посетите другие страницы:",
            GlobalTranslation.LOCATION_SPACE_LISTING_FETCH_MORE_BUTTON to "Загрузить больше",

            WebsiteTranslation.LOCATION_TITLE to "d1snin's page",
            WebsiteTranslation.LOCATION_DESCRIPTION to "Моя публичная страница. Здесь можно узнать чуть больше обо мне.",
            WebsiteTranslation.LOCATION_INTRO_HEADING to "(:emoji-wink:)(orange) Говорю компьютерам, что им делать.",
            WebsiteTranslation.LOCATION_INTRO_TEXT to "Привет! Меня зовут Михаил. Я - веб-разработчик-энтузиаст. " +
                    "Люблю Kotlin и все, что его касается. Больше всего заинтересован в бэкенд-разработке. " +
                    "Я имею широкий опыт работы с крупными JVM фрэймворками, включая Spring (Boot, Data, Web, etc), JPA и другие " +
                    "Сейчас работаю на Kotlin вместе с Ktor и другими специализированными библиотеками. Пишу фронтенд тоже на Kotlin. Использую [KVision][https://kvision.io].",
            WebsiteTranslation.LOCATION_WHAT_IS_THIS_HEADING to "(:question-circle:)(orange) Что это такое?",
            WebsiteTranslation.LOCATION_WHAT_IS_THIS_TEXT_FIRST_PARAGRAPH to "Это мой веб-сайт, запущенный на моем *веб-движке* - [*Beam*][https://github.com/d1snin/beam].",
            WebsiteTranslation.LOCATION_WHAT_IS_THIS_TEXT_SECOND_PARAGRAPH to "Здесь можно узнать обо мне, или просто связаться.",
            WebsiteTranslation.LOCATION_CONTACTS_HEADING to "(:chat-dots:)(orange) Как мне написать?",
            WebsiteTranslation.LOCATION_CONTACTS_TEXT to "Со мной можно пообщаться в Telegram. Вот ссылка. *Не стесняйтесь даже просто написать!*",
            WebsiteTranslation.LOCATION_CONTACTS_TELEGRAM_TEXT to "Telegram",
            WebsiteTranslation.LOCATION_CONTACTS_TELEGRAM_URL to "https://t.me/d1snin",
            WebsiteTranslation.LOCATION_WHAT_AM_I_DOING_HEADING to "(:hammer:)(orange) Чем я сейчас занимаюсь?",
            WebsiteTranslation.LOCATION_WHAT_AM_I_DOING_FIRST_PARAGRAPH to "Сейчас работаю как фриланс-разработчик. Я беру заказы на создание " +
                    "веб-сайтов, чат-ботов, серверных приложений и т.п.",
            WebsiteTranslation.LOCATION_WHAT_AM_I_DOING_SECOND_PARAGRAPH to "Преимущественно, работаю с локальным российским рынком. Подробнее можно узнать на сайте.",
            WebsiteTranslation.LOCATION_WHAT_AM_I_DOING_BUSINESS_WEBSITE_TEXT to "Перейти к titov.digital",
            WebsiteTranslation.LOCATION_WHAT_AM_I_DOING_BUSINESS_WEBSITE_URL to "https://titov.digital"
        )
    }
}