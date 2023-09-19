/*
 * Copyright 2023 Mikhail Titov
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

import dev.d1s.beam.client.app.ApplicationContext
import dev.d1s.beam.client.app.state.translation
import dev.d1s.beam.commons.GlobalTranslation

suspend fun ApplicationContext.englishTranslation() {
    translation {
        languageCode = "en"
        default = true

        translations(
            GlobalTranslation.LOCATION_ICON_ALT to "Beam space icon",
            GlobalTranslation.LOCATION_SPACE_INFO_DEFAULT_TITLE to "Beam",
            GlobalTranslation.LOCATION_EXPLORE_DROPDOWN_CALLOUT to "Explore",
            GlobalTranslation.LOCATION_DAEMON_STATUS_CONNECTED to "Connected to daemon.",
            GlobalTranslation.LOCATION_DAEMON_STATUS_DISCONNECTED to "Couldn't connect to daemon.",
            GlobalTranslation.LOCATION_DAEMON_STATUS_MS_UNIT to "ms",
            GlobalTranslation.LOCATION_SPACE_FAILURE_CARD_NOT_FOUND_ICON_ALT to "404 image",
            GlobalTranslation.LOCATION_SPACE_FAILURE_CARD_NOT_FOUND_MESSAGE to "We couldn't find anything.",
            GlobalTranslation.LOCATION_SPACE_FAILURE_CARD_EMPTY_SPACE_ICON_ALT to "Empty space icon",
            GlobalTranslation.LOCATION_SPACE_FAILURE_CARD_EMPTY_SPACE_MESSAGE to "This space seems to be empty.",
            GlobalTranslation.LOCATION_FOOTER_MESSAGE_FIRST_PART to "Running",
            GlobalTranslation.LOCATION_FOOTER_MESSAGE_SECOND_PART to "Beam",
            GlobalTranslation.LOCATION_FOOTER_SOURCE_CODE_LINK_MESSAGE to "Source code on GitHub",
            GlobalTranslation.LOCATION_FOOTER_SOURCE_CODE_LINK_URL to "https://github.com/d1snin/beam",
            GlobalTranslation.LOCATION_FOOTER_LANGUAGE_SWITCHER_MESSAGE to "Switch language...",
            GlobalTranslation.LOCATION_SPACE_LISTING_MESSAGE to "Explore the spaces on this instance:",
            GlobalTranslation.LOCATION_SPACE_LISTING_FETCH_MORE_BUTTON to "Load more",

            WebsiteTranslation.LOCATION_TITLE to "d1snin's place",
            WebsiteTranslation.LOCATION_DESCRIPTION to "This is my Internet page. You can learn more about me here.",
            WebsiteTranslation.LOCATION_INTRO_HEADING to "(:emoji-wink:)(orange) I tell computers what to do.",
            WebsiteTranslation.LOCATION_INTRO_TEXT to "Hey, welcome to my page. My name is Mikhail. I'm a web developer and enthusiast. " +
                    "I love Kotlin and everything related to it. Mostly interested in backend development. " +
                    "I have a wide-range experience using industry-standard JVM frameworks including Spring (Boot, Data, Web, etc), JPA and others. " +
                    "Now using Kotlin with Ktor as a web framework. I also develop frontend using [KVision][https://kvision.io].",
            WebsiteTranslation.LOCATION_WHAT_IS_THIS_HEADING to "(:question-circle:)(orange) What is this?",
            WebsiteTranslation.LOCATION_WHAT_IS_THIS_TEXT_FIRST_PARAGRAPH to "This is my website running on home-made mini WCM - [*Beam*][https://github.com/d1snin/beam].",
            WebsiteTranslation.LOCATION_WHAT_IS_THIS_TEXT_SECOND_PARAGRAPH to "Here you can learn more about me or just contact me.",
            WebsiteTranslation.LOCATION_CONTACTS_HEADING to "(:chat-dots:)(orange) How to contact me?",
            WebsiteTranslation.LOCATION_CONTACTS_TEXT to "You can chat with me on Telegram. Here is the link. *Don't hesitate to say hello!*",
            WebsiteTranslation.LOCATION_CONTACTS_TELEGRAM_TEXT to "Telegram",
            WebsiteTranslation.LOCATION_CONTACTS_TELEGRAM_URL to "https://t.me/d1snin",
            WebsiteTranslation.LOCATION_WHAT_AM_I_DOING_HEADING to "(:hammer:)(orange) What am I doing for now?",
            WebsiteTranslation.LOCATION_WHAT_AM_I_DOING_FIRST_PARAGRAPH to "Currently, I work as a freelance developer, I take orders on making " +
                    "websites, chat bots, server applications and so on.",
            WebsiteTranslation.LOCATION_WHAT_AM_I_DOING_SECOND_PARAGRAPH to "I primarily work with the Russian market. Jump onto my business website!",
            WebsiteTranslation.LOCATION_WHAT_AM_I_DOING_BUSINESS_WEBSITE_TEXT to "Go to titov.digital",
            WebsiteTranslation.LOCATION_WHAT_AM_I_DOING_BUSINESS_WEBSITE_URL to "https://titov.digital"
        )
    }
}