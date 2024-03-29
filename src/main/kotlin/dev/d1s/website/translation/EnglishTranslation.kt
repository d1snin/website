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

suspend fun SpaceContext.englishTranslation() {
    translation {
        languageCode = "en"
        default = true

        translations(
            *GlobalTranslation.Default.translations.map { it.key to it.value }.toTypedArray(),
            WebsiteTranslation.LOCATION_ROOT_TITLE to "d1snin's place",
            WebsiteTranslation.LOCATION_ROOT_DESCRIPTION to "This is my Internet page. You can learn more about me here.",
            WebsiteTranslation.LOCATION_ROOT_INTRO_HEADING to "(:emoji-wink:)(orange) I tell computers what to do.",
            WebsiteTranslation.LOCATION_ROOT_INTRO_PARAGRAPH to "Hey, welcome to my page. My name is Mikhail. I'm a web developer and enthusiast. " +
                    "I love Kotlin and everything related to it. Mostly interested in backend development. " +
                    "I have a wide-range experience using industry-standard JVM frameworks including Spring (Boot, Data, Web, etc), JPA and others. " +
                    "Now using Kotlin with Ktor as a web framework. I also develop frontend using [KVision][https://kvision.io].",
            WebsiteTranslation.LOCATION_ROOT_WHAT_IS_THIS_HEADING to "(:question-circle:)(orange) What is this?",
            WebsiteTranslation.LOCATION_ROOT_WHAT_IS_THIS_FIRST_PARAGRAPH to "This is my website running on home-made mini WCM - [*Beam*][https://github.com/d1snin/beam].",
            WebsiteTranslation.LOCATION_ROOT_WHAT_IS_THIS_SECOND_PARAGRAPH to "Here you can learn more about me or just contact me.",
            WebsiteTranslation.LOCATION_ROOT_WHAT_AM_I_DOING_HEADING to "(:hammer:)(orange) What am I doing for now?",
            WebsiteTranslation.LOCATION_ROOT_WHAT_AM_I_DOING_FIRST_PARAGRAPH to "Currently, I work as a freelance developer, I take orders on making " +
                    "websites, chat bots, server applications and so on.",
            WebsiteTranslation.LOCATION_ROOT_WHAT_AM_I_DOING_SECOND_PARAGRAPH to "I primarily work with the Russian market. Jump onto my business website!",
            WebsiteTranslation.LOCATION_ROOT_WHAT_AM_I_DOING_BUSINESS_WEBSITE_TEXT to "Go to titov.digital",
            WebsiteTranslation.LOCATION_ROOT_WHAT_AM_I_DOING_BUSINESS_WEBSITE_URL to "https://titov.digital",
            WebsiteTranslation.LOCATION_ROOT_OPEN_SOURCE_HEADING to "(:github:)(orange) Open Source",
            WebsiteTranslation.LOCATION_ROOT_OPEN_SOURCE_PARAGRAPH to "I maintain a bunch of open-source projects. You can explore repos on my GitHub.",
            WebsiteTranslation.LOCATION_ROOT_OPEN_SOURCE_GITHUB_TEXT to "Go to GitHub",
            WebsiteTranslation.LOCATION_ROOT_OPEN_SOURCE_GITHUB_URL to "https://github.com/d1snin",
            WebsiteTranslation.LOCATION_ROOT_CONTACTS_HEADING to "(:chat-dots:)(orange) How to contact me?",
            WebsiteTranslation.LOCATION_ROOT_CONTACTS_PARAGRAPH to "You can chat with me on Telegram. Here is the link. *Don't hesitate to say hello!*",
            WebsiteTranslation.LOCATION_ROOT_CONTACTS_TELEGRAM_TEXT to "Go to Telegram",
            WebsiteTranslation.LOCATION_ROOT_CONTACTS_TELEGRAM_URL to "https://t.me/d1snin",

            WebsiteTranslation.LOCATION_SECURITY_ROOM_TITLE to "Security Room",
            WebsiteTranslation.LOCATION_SECURITY_ROOM_DESCRIPTION to "Nearby IP cameras. Spy on me online for free.",

            WebsiteTranslation.LOCATION_IMAGEBOARD_TITLE to "Imageboard",
            WebsiteTranslation.LOCATION_IMAGEBOARD_DESCRIPTION to "Pure randomcore I liked",
            WebsiteTranslation.LOCATION_IMAGEBOARD_INTRO_HEADING to "(:images:)(orange) Good landing on my imageboard.",
            WebsiteTranslation.LOCATION_IMAGEBOARD_INTRO_PARAGRAPH to "Here I post absolute randomness I've found somewhere in the *deepest parts of the Internet*.",

            WebsiteTranslation.LOCATION_GALLERY_TITLE to "Gallery",
            WebsiteTranslation.LOCATION_GALLERY_DESCRIPTION to "Every-day life. Imaged.",
            WebsiteTranslation.LOCATION_GALLERY_INTRO_HEADING to "(:images:)(orange) [Imageboard][/imageboard] but real.",
            WebsiteTranslation.LOCATION_GALLERY_INTRO_PARAGRAPH to "Unlike in imageboard, here I post pictures made by myself. Posts here are rare. *Enjoy*."
        )
    }
}