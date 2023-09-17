package dev.d1s.website.block

import dev.d1s.beam.client.ContentEntitiesBuilder
import dev.d1s.beam.client.app.state.BlockContext
import dev.d1s.beam.commons.BlockSize
import dev.d1s.beam.commons.asTemplate
import dev.d1s.beam.commons.contententity.ButtonLink
import dev.d1s.beam.commons.contententity.Text
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
    entity {
        type = Text

        parameters(
            "value" to WebsiteTranslation.LOCATION_WHAT_AM_I_DOING_HEADING.asTemplate,
            "heading" to "h2"
        )
    }
}

private fun ContentEntitiesBuilder.text() {
    entity {
        type = Text

        parameters(
            "value" to WebsiteTranslation.LOCATION_WHAT_AM_I_DOING_FIRST_PARAGRAPH.asTemplate
        )
    }

    entity {
        type = Text

        parameters(
            "value" to WebsiteTranslation.LOCATION_WHAT_AM_I_DOING_SECOND_PARAGRAPH.asTemplate
        )
    }
}

private fun ContentEntitiesBuilder.businessLink() {
    entity {
        type = ButtonLink

        parameters(
            "text" to WebsiteTranslation.LOCATION_WHAT_AM_I_DOING_BUSINESS_WEBSITE_TEXT.asTemplate,
            "url" to WebsiteTranslation.LOCATION_WHAT_AM_I_DOING_BUSINESS_WEBSITE_URL.asTemplate,
            "width" to "100"
        )
    }
}