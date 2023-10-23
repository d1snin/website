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

package dev.d1s.website.block.root

import dev.d1s.beam.client.*
import dev.d1s.beam.client.app.state.SpaceContext
import dev.d1s.beam.client.app.state.mediumBlockWithEntities
import dev.d1s.beam.commons.asTemplate
import dev.d1s.beam.commons.contententity.ButtonLinkContentEntityTypeDefinition
import dev.d1s.website.translation.WebsiteTranslation

suspend fun SpaceContext.openSource() {
    mediumBlockWithEntities {
        heading()
        text()
        githubLink()
    }
}

private fun ContentEntitiesBuilder.heading() {
    secondHeading(value = WebsiteTranslation.LOCATION_ROOT_OPEN_SOURCE_HEADING.asTemplate)
}

private fun ContentEntitiesBuilder.text() {
    text(value = WebsiteTranslation.LOCATION_ROOT_OPEN_SOURCE_PARAGRAPH.asTemplate)
}

private fun ContentEntitiesBuilder.githubLink() {
    fullWidthButtonLink(
        text = WebsiteTranslation.LOCATION_ROOT_OPEN_SOURCE_GITHUB_TEXT.asTemplate,
        icon = "github",
        url = WebsiteTranslation.LOCATION_ROOT_OPEN_SOURCE_GITHUB_URL.asTemplate,
        style = ButtonLinkContentEntityTypeDefinition.Style.PRIMARY,
    )
}