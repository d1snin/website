package dev.d1s.website.block

import dev.d1s.beam.client.app.state.BlockContext
import dev.d1s.beam.commons.BlockSize
import dev.d1s.beam.commons.asTemplate
import dev.d1s.beam.commons.contententity.Text
import dev.d1s.website.translation.WebsiteTranslation

suspend fun BlockContext.intro() {
    setSize {
        BlockSize.LARGE
    }

    setEntities {
        entity {
            type = Text

            parameters(
                "value" to WebsiteTranslation.LOCATION_INTRO_HEADING.asTemplate,
                "heading" to "h1"
            )
        }

        entity {
            type = Text

            parameters(
                "value" to WebsiteTranslation.LOCATION_INTRO_TEXT.asTemplate
            )
        }
    }
}