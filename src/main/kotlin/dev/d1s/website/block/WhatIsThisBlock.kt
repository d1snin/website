package dev.d1s.website.block

import dev.d1s.beam.client.app.state.BlockContext
import dev.d1s.beam.commons.BlockSize
import dev.d1s.beam.commons.asTemplate
import dev.d1s.beam.commons.contententity.Text
import dev.d1s.website.translation.WebsiteTranslation

suspend fun BlockContext.whatIsThis() {
    setSize {
        BlockSize.MEDIUM
    }

    setEntities {
        entity {
            type = Text

            parameters(
                "value" to WebsiteTranslation.LOCATION_WHAT_IS_THIS_HEADING.asTemplate,
                "heading" to "h2"
            )
        }

        entity {
            type = Text

            parameters(
                "value" to WebsiteTranslation.LOCATION_WHAT_IS_THIS_TEXT.asTemplate
            )
        }
    }
}