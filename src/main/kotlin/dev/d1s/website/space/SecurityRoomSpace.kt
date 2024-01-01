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

package dev.d1s.website.space

import dev.d1s.beam.client.app.ApplicationContext
import dev.d1s.beam.client.app.state.SpaceContext
import dev.d1s.beam.client.app.state.space
import dev.d1s.beam.commons.asTemplate
import dev.d1s.website.block.securityroom.camera
import dev.d1s.website.translation.WebsiteTranslation
import dev.d1s.website.translation.englishTranslation
import dev.d1s.website.translation.russianTranslation
import dev.d1s.website.util.setDefaultIcon

private const val IDENTIFIER = "security-room"

private val embeds = listOf(
    "s.b47c2724a66e012f1a9b0a5f6db3b4793ef6e1c61",
    "s.f5e805236f5a3c0f7fd8f631904a976dfbd3456b1",
    "s.79066574733de0ad4d299c45d57c9312aeae81961",
    "s.c314adb0f795ee33fa059cdce5984baf00b04fa11"
)

suspend fun ApplicationContext.securityRoomSpace() {
    space(IDENTIFIER) {
        englishTranslation()
        russianTranslation()

        view()

        embeds()
    }
}

private suspend fun SpaceContext.view() {
    setView {
        setDefaultIcon(IDENTIFIER)

        title = WebsiteTranslation.LOCATION_SECURITY_ROOM_TITLE.asTemplate
        description = WebsiteTranslation.LOCATION_SECURITY_ROOM_DESCRIPTION.asTemplate
    }
}

private suspend fun SpaceContext.embeds() {
    embeds.forEach { id ->
        camera(id)
    }
}