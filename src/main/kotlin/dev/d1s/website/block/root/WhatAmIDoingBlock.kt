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

import dev.d1s.beam.client.ContentEntitiesBuilder
import dev.d1s.beam.client.app.state.BlockContext
import dev.d1s.beam.client.buttonLink
import dev.d1s.beam.client.text
import dev.d1s.beam.commons.BlockSize
import dev.d1s.beam.commons.asTemplate
import dev.d1s.website.translation.WebsiteTranslation

suspend fun BlockContext.whatAmIDoing() {
    setSize {
        BlockSize.MEDIUM
    }

    setEntities {
        heading()
        text()
        businessLink()
    }
}

private fun ContentEntitiesBuilder.heading() {
    text(value = WebsiteTranslation.LOCATION_ROOT_WHAT_AM_I_DOING_HEADING.asTemplate, heading = "h2")
}

private fun ContentEntitiesBuilder.text() {
    text(value = WebsiteTranslation.LOCATION_ROOT_WHAT_AM_I_DOING_FIRST_PARAGRAPH.asTemplate)
    text(value = WebsiteTranslation.LOCATION_ROOT_WHAT_AM_I_DOING_SECOND_PARAGRAPH.asTemplate)
}

private fun ContentEntitiesBuilder.businessLink() {
    buttonLink(
        text = WebsiteTranslation.LOCATION_ROOT_WHAT_AM_I_DOING_BUSINESS_WEBSITE_TEXT.asTemplate,
        url = WebsiteTranslation.LOCATION_ROOT_WHAT_AM_I_DOING_BUSINESS_WEBSITE_URL.asTemplate,
        width = 100
    )
}