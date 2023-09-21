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

package dev.d1s.website.util

import dev.d1s.beam.client.ViewConfigurationBuilder
import dev.d1s.beam.commons.SpaceThemeDefinition

object DefaultIcon {

    const val URL = "https://s3.d1s.dev/d1s-dev/icon.png"

    const val APPLE_TOUCH_ICON_URL = "https://s3.d1s.dev/d1s-dev/apple-touch-icon.png"
    const val FAVICON_16_URL = "https://s3.d1s.dev/d1s-dev/favicon-16x16.png"
    const val FAVICON_32_URL = "https://s3.d1s.dev/d1s-dev/favicon-32x32.png"
    const val FAVICON_ICO_URL = "https://s3.d1s.dev/d1s-dev/favicon.ico"
}

fun ViewConfigurationBuilder.setDefaultIcon() {
    theme = SpaceThemeDefinition.CatppuccinMocha.name
    icon = DefaultIcon.URL

    favicon {
        appleTouch = DefaultIcon.APPLE_TOUCH_ICON_URL
        favicon16 = DefaultIcon.FAVICON_16_URL
        favicon32 = DefaultIcon.FAVICON_32_URL
        faviconIco = DefaultIcon.FAVICON_ICO_URL
    }
}