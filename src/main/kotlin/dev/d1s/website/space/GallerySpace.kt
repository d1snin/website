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

package dev.d1s.website.space

import dev.d1s.beam.client.app.ApplicationContext
import dev.d1s.beam.client.app.state.SpaceContext
import dev.d1s.beam.client.app.state.space
import dev.d1s.beam.commons.asTemplate
import dev.d1s.website.block.gallery.intro
import dev.d1s.website.translation.WebsiteTranslation
import dev.d1s.website.translation.englishTranslation
import dev.d1s.website.translation.russianTranslation
import dev.d1s.website.util.setDefaultIcon

private const val IDENTIFIER = "gallery"

suspend fun ApplicationContext.gallerySpace() {
    space(IDENTIFIER, processBlocks = false) {
        englishTranslation()
        russianTranslation()

        view()

        blocks()
    }
}

private suspend fun SpaceContext.view() {
    setView {
        setDefaultIcon(IDENTIFIER)

        title = WebsiteTranslation.LOCATION_GALLERY_TITLE.asTemplate
        description = WebsiteTranslation.LOCATION_GALLERY_DESCRIPTION.asTemplate
    }
}

private suspend fun SpaceContext.blocks() {
    intro()
}