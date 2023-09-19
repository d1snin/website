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
import dev.d1s.beam.commons.ROOT_SPACE_SLUG
import dev.d1s.beam.commons.SpaceThemeDefinition
import dev.d1s.beam.commons.asTemplate
import dev.d1s.website.translation.WebsiteTranslation

private const val ICON_URL = "https://s3.d1s.dev/d1s-dev/icon.png"

private const val APPLE_TOUCH_ICON_URL = "https://s3.d1s.dev/d1s-dev/apple-touch-icon.png"
private const val FAVICON_16_URL = "https://s3.d1s.dev/d1s-dev/favicon-16x16.png"
private const val FAVICON_32_URL = "https://s3.d1s.dev/d1s-dev/favicon-32x32.png"
private const val FAVICON_ICO_URL = "https://s3.d1s.dev/d1s-dev/favicon.ico"

suspend fun ApplicationContext.rootSpace(block: suspend SpaceContext.() -> Unit) {
    space(ROOT_SPACE_SLUG) {
        setView {
            theme = SpaceThemeDefinition.CatppuccinMocha.name
            icon = ICON_URL

            favicon {
                appleTouch = APPLE_TOUCH_ICON_URL
                favicon16 = FAVICON_16_URL
                favicon32 = FAVICON_32_URL
                faviconIco = FAVICON_ICO_URL
            }

            title = WebsiteTranslation.LOCATION_TITLE.asTemplate
            description = WebsiteTranslation.LOCATION_DESCRIPTION.asTemplate

            block()
        }
    }
}