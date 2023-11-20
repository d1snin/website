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

package dev.d1s.website.block.imageboard

import dev.d1s.beam.client.ContentEntitiesBuilder
import dev.d1s.beam.client.app.state.SpaceContext
import dev.d1s.beam.client.app.state.largeBlockWithEntities
import dev.d1s.beam.client.firstHeading
import dev.d1s.beam.client.text
import dev.d1s.beam.commons.asTemplate
import dev.d1s.website.translation.WebsiteTranslation

suspend fun SpaceContext.intro() {
    largeBlockWithEntities {
        heading()
        text()
    }
}

private fun ContentEntitiesBuilder.heading() {
    firstHeading(value = WebsiteTranslation.LOCATION_IMAGEBOARD_INTRO_HEADING.asTemplate)
}

private fun ContentEntitiesBuilder.text() {
    text(value = WebsiteTranslation.LOCATION_IMAGEBOARD_INTRO_PARAGRAPH.asTemplate)
}