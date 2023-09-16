package dev.d1s.website.space

import dev.d1s.beam.client.app.ApplicationContext
import dev.d1s.beam.client.app.state.space
import dev.d1s.beam.commons.SpaceThemeDefinition
import dev.d1s.beam.commons.asTemplate
import dev.d1s.website.translation.WebsiteTranslation

private const val ICON_URL = "https://s3.d1s.dev/d1s-dev/icon.png"

private const val APPLE_TOUCH_ICON_URL = "https://s3.d1s.dev/d1s-dev/apple-touch-icon.png"
private const val FAVICON_16_URL = "https://s3.d1s.dev/d1s-dev/favicon-16x16.png"
private const val FAVICON_32_URL = "https://s3.d1s.dev/d1s-dev/favicon-32x32.png"
private const val FAVICON_ICO_URL = "https://s3.d1s.dev/d1s-dev/favicon.ico"

suspend fun ApplicationContext.configureSpace() {
    space {
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
        }
    }
}