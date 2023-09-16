package dev.d1s.website.block

import dev.d1s.beam.client.ContentEntitiesBuilder
import dev.d1s.beam.client.app.state.BlockContext
import dev.d1s.beam.commons.BlockSize
import dev.d1s.beam.commons.asTemplate
import dev.d1s.beam.commons.contententity.ButtonLink
import dev.d1s.beam.commons.contententity.ButtonLinkContentEntityTypeDefinition
import dev.d1s.beam.commons.contententity.Text
import dev.d1s.website.translation.WebsiteTranslation

suspend fun BlockContext.contacts() {
    setSize {
        BlockSize.MEDIUM
    }

    setEntities {
        heading()
        text()
        links()
    }
}

private fun ContentEntitiesBuilder.heading() {
    entity {
        type = Text

        parameters(
            "value" to WebsiteTranslation.LOCATION_CONTACTS_HEADING.asTemplate,
            "heading" to "h2"
        )
    }
}

private fun ContentEntitiesBuilder.text() {
    entity {
        type = Text

        parameters(
            "value" to WebsiteTranslation.LOCATION_CONTACTS_TEXT.asTemplate
        )
    }
}

private fun ContentEntitiesBuilder.links() {
    entity {
        type = ButtonLink

        parameters(
            "text" to WebsiteTranslation.LOCATION_CONTACTS_TELEGRAM_TEXT.asTemplate,
            "url" to WebsiteTranslation.LOCATION_CONTACTS_TELEGRAM_URL.asTemplate,
            "style" to ButtonLinkContentEntityTypeDefinition.Style.INFO.identifier,
            "width" to "100"
        )
    }
}